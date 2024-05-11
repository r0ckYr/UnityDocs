package com.unitydocs.backend.controller;

import com.unitydocs.backend.model.Document;
import com.unitydocs.backend.model.User;
import com.unitydocs.backend.repository.DocumentRepository;
import com.unitydocs.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentController {

    private final DocumentRepository documentRepository;
    private final UserRepository userRepository;
    private final String document_dir;
    public DocumentController(DocumentRepository documentRepository, UserRepository userRepository) {
        this.documentRepository = documentRepository;
        this.userRepository = userRepository;
        this.document_dir = "./documents/";
    }
    @PostMapping("/create")
    public DocumentResponse createDocument(@RequestBody DocumentRequest request) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        Optional<User> owner = userRepository.findByEmail(username);
        if (owner.isEmpty()) {
            return DocumentResponse.builder()
                    .error("User Not Found")
                    .build();
        }
        String document_file_path = document_dir + owner.get().getName() + "-" +
                request.getName() + "-" + String.valueOf(System.currentTimeMillis()) + "_1.md";

        try {
            File file = new File(document_file_path);
            if (file.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                throw new RuntimeException("File already exists");
            }
        } catch (Exception e) {
            return DocumentResponse.builder()
                    .error("Failed to save file")
                    .build();
        }
        var document = Document.builder()
                .name(request.getName())
                .file_path(document_file_path)
                .is_public(request.is_public())
                .latest_version(request.getCurrentVersion())
                .owner(owner.get())
                .owner_id(owner.get().getId())
                .build();
        try {
            Document savedDocument = documentRepository.save(document);
            return DocumentResponse.builder()
                    .id(savedDocument.getId())
                    .name(savedDocument.getName())
                    .file_path(savedDocument.getFile_path())
                    .error(null)
                    .build();
        } catch (Exception e) {
            return DocumentResponse.builder()
                    .error("Failed to create the document")
                    .build();
        }
    }

    @GetMapping("/all")
    public List<DocumentResponse> getAllUserDocuments(Authentication authentication) {
        System.out.println("test123");
        String username = authentication.getName();
        System.out.println(username);
        Optional<User> user = userRepository.findByEmail(username);
        List<DocumentResponse> response = new ArrayList<>();
        if (user.isPresent()) {
            List<Document> userDocuments = documentRepository.findByOwner(user.get());
            return userDocuments.stream()
                    .map(document -> DocumentResponse.builder()
                            .id(document.getId())
                            .name(document.getName())
                            .file_path(document.getFile_path())
                            .build())
                    .collect(Collectors.toList());
        }
        return response;
    }

    // return content of doucment file in this
    @GetMapping("/{documentId}")
    public ResponseEntity<DocumentResponse> getDocumentById(Authentication authentication, @PathVariable int documentId) {
        String username = authentication.getName();
        Optional<User> user = userRepository.findByEmail(username);
        Optional<Document> optionalDocument = documentRepository.findById(documentId);

        if (user.isPresent() && optionalDocument.isPresent() && !optionalDocument.get().is_public() && (optionalDocument.get().getOwner() != user.get())) {
            // Forbidden access
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        return optionalDocument.map(document -> {
            // Build DocumentResponse object
            DocumentResponse documentResponse = DocumentResponse.builder()
                    .id(document.getId())
                    .name(document.getName())
                    .file_path(document.getFile_path())
                    .build();
            return new ResponseEntity<>(documentResponse, HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //todo not completed
    @PutMapping("/{documentId}")
    public ResponseEntity<Document> updateDocument(@PathVariable int documentId, @RequestBody Document updatedDocument) {
        Optional<Document> optionalDocument = documentRepository.findById(documentId);
        if (optionalDocument.isPresent()) {
            updatedDocument.setId(documentId); // Make sure the ID matches
            Document savedDocument = documentRepository.save(updatedDocument);
            return new ResponseEntity<>(savedDocument, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{documentId}")
    public ResponseEntity<Void> deleteDocument(Authentication authentication, @PathVariable int documentId) {
        String username = authentication.getName();
        Optional<User> user = userRepository.findByEmail(username);
        Optional<Document> optionalDocument = documentRepository.findById(documentId);
        if(user.isPresent() && optionalDocument.isPresent() && optionalDocument.get().getOwner() != user.get())
        {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        if (optionalDocument.isPresent()) {
            documentRepository.deleteById(documentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

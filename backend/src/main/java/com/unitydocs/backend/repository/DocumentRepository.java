package com.unitydocs.backend.repository;

import com.unitydocs.backend.model.Document;
import com.unitydocs.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DocumentRepository extends JpaRepository<Document, Integer> {
    List<Document> findByOwner(User user);
}

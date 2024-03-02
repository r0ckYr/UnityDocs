package com.unitydocs.backend.repository;

import com.unitydocs.backend.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Integer> {

}

package com.unitydocs.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unitydocs.backend.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}

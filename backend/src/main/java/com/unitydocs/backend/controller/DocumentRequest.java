package com.unitydocs.backend.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class DocumentRequest {
    String name;
    private String currentVersion;
    private boolean is_public;
}

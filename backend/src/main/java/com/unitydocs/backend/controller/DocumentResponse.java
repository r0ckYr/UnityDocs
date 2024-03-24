package com.unitydocs.backend.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentResponse {
    int id;
    String name;
    String file_path;
    String error;
}

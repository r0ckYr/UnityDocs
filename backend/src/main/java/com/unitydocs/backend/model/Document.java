package com.unitydocs.backend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String latest_version;
    @ManyToOne
    @JoinColumn(name = "owner")
    private User owner;
    private int owner_id;
    private String file_path;
    private boolean is_public;
}

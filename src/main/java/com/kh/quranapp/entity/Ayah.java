package com.kh.quranapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;

@Data
@Entity(name = "ayahs")
@Document(indexName = "ayahs")
public class Ayah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;
    private String text;
    private int numberInSurah;
    private int page;
    private int surahId;
    private int hizbId;
    private int juzId;
    private boolean sajda;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Getters and setters
}

package com.kh.quranapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;

@Data
@Entity(name = "surahs")
@Document(indexName = "surahs")
public class Surah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;
    private String nameAr;
    private String nameEn;
    private String nameEnTranslation;
    private String type;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Getters and setters
}


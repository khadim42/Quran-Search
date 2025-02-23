package com.kh.quranapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.annotation.Id;

@Data
@Entity(name = "quran_words")
//@Document(indexName = "quran_words", createIndex = true)
@Document(indexName = "quran_words")
public class QuranWord {

//    @Id
//    private String id;  // Elasticsearch requires String for IDs
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer aya;
    private Integer sura;
    private Integer position;
    @Column(name = "verse_key")
    private String verseKey;
    private String text;
    private String simple;
    private Integer juz;
    private Integer hezb;
    private Integer rub;
    private Integer page;
    private String className;
    private Integer line;
    private String code;
    private String code_V3;
    private String charType;
    private String audio;
    private String translation;

    // Getters and setters
}

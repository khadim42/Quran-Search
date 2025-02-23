package com.kh.quranapp.entity;

// UrJalandhry.java


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

//@Data
@Entity
@Table(name = "ur_jalandhry")
@Document(indexName = "ur_jalandhry")
public class UrJalandhry {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Id
    private Long id;

    private int sura;
    private int aya;

    @Lob
    private String text;

    // Getters and setters
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSura() {
        return sura;
    }

    public void setSura(int sura) {
        this.sura = sura;
    }

    public int getAya() {
        return aya;
    }

    public void setAya(int aya) {
        this.aya = aya;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}


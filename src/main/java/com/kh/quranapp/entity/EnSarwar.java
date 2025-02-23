package com.kh.quranapp.entity;

// EnSarwar.java
import jakarta.persistence.*;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Table(name = "en_sarwar")
@Document(indexName = "en_sarwar")
public class EnSarwar {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

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

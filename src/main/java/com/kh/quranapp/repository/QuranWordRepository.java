package com.kh.quranapp.repository;

import com.kh.quranapp.entity.QuranWord;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuranWordRepository extends JpaRepository<QuranWord, String> {
    List<QuranWord> findByTextContaining(String text);

    List<QuranWord> findByTranslationContaining(String text);
}

package com.kh.quranapp.service;

import com.kh.quranapp.entity.QuranWord;
//import com.kh.quranapp.entity.Translation;
import com.kh.quranapp.repository.QuranWordRepository;
//import com.kh.quranapp.repository.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuranService {

    @Autowired
    private QuranWordRepository quranWordRepository;

//    @Autowired
//    private TranslationRepository translationRepository;

//    @Autowired
//    private SurahRepository surahRepository;

    // Elasticsearch search for Quran words
    public List<QuranWord> searchWordsInElasticsearch(String query) {
        return quranWordRepository.findByTranslationContaining(query);
    }

    // Elasticsearch search for translations
//    public List<Translation> searchTranslationsInElasticsearch(String query) {
//        return translationRepository.findByTextContaining(query);
//    }
}


//package com.kh.quranapp.service;
//
//import com.kh.quranapp.entity.QuranWordSearch;
//import com.kh.quranapp.entity.TranslationSearch;
//import com.kh.quranapp.repository.QuranWordSearchRepository;
//import com.kh.quranapp.repository.TranslationSearchRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class QuranSearchService {
//
//    @Autowired
//    private QuranWordSearchRepository quranWordSearchRepository;
//
//    @Autowired
//    private TranslationSearchRepository translationSearchRepository;
//
//    public List<QuranWordSearch> searchQuranWords(String query) {
//        return quranWordSearchRepository.findByTextContaining(query);
//    }
//
//    public List<TranslationSearch> searchTranslations(String query) {
//        return translationSearchRepository.findByTextContaining(query);
//    }
//}
//

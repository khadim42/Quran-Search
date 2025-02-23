package com.kh.quranapp.service;

import com.kh.quranapp.entity.*;
import com.kh.quranapp.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranslationSearchService {

//    @Autowired
//    private UrJalandhrySearchRepository urJalandhrySearchRepository;

//    @Autowired
//    private EnSarwarSearchRepository enSarwarSearchRepository;

    @Autowired
    private EnSahihRepository enSahihRepository;

    @Autowired
    private AyahRepository ayahRepository;

    @Autowired
    private SurahRepository surahRepository;

    @Autowired
    private QuranWordRepository quranWordRepository;

    // Search by text across all entities
    public List<Object> searchByText(String query) {
//        List<UrJalandhry> urJalandhryResults = urJalandhrySearchRepository.findByTextContaining(query);
//        List<EnSarwar> enSarwarResults = enSarwarSearchRepository.findByTextContaining(query);
        List<EnSahih> enSahihResults = enSahihRepository.findByTextContaining(query);
        List<Ayah> ayahResults = ayahRepository.findByTextContaining(query);
        List<Surah> surahResults = surahRepository.findByNameEnContaining(query);
        List<QuranWord> quranWordResults = quranWordRepository.findByTextContaining(query);

        // Return a combined list of all results (you can modify this based on your needs)
        return List.of( enSahihResults, ayahResults, surahResults, quranWordResults);
    }
}

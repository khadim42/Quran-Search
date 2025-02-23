//package com.kh.quranapp.service;
//
//// TranslationService.java
//import com.kh.quranapp.dtos.TranslationResult;
//import com.kh.quranapp.entity.EnSahih;
//import com.kh.quranapp.entity.EnSarwar;
//import com.kh.quranapp.entity.UrJalandhry;
//import com.kh.quranapp.repository.EnSahihRepository;
//import com.kh.quranapp.repository.EnSarwarRepository;
//import com.kh.quranapp.repository.UrJalandhryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TranslationService {
//
//    @Autowired
//    private EnSahihRepository enSahihRepository;
//
//    @Autowired
//    private EnSarwarRepository enSarwarRepository;
//
//    @Autowired
//    private UrJalandhryRepository urJalandhryRepository;
//
//    // Search by sura and aya
//    public Object getTranslationBySuraAndAya(int sura, int aya) {
//        EnSahih sahih = enSahihRepository.findBySuraAndAya(sura, aya);
//        EnSarwar sarwar = enSarwarRepository.findBySuraAndAya(sura, aya);
//        UrJalandhry jalandhry = urJalandhryRepository.findBySuraAndAya(sura, aya);
//
//        return new TranslationResult(sahih, sarwar, jalandhry);
//    }
//
//    // Search by text (partial match)
//    public Object searchByText(String query) {
//        // Implement logic to search by text across all translations
//        // Example for one repository:
//        // return enSahihRepository.findByTextContaining(query);
//        // You can extend the search to other repositories as well
//        return null;
//    }
//}

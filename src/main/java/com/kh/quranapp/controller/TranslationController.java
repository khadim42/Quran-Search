//package com.kh.quranapp.controller;
//
//// TranslationController.java
//import com.kh.quranapp.service.TranslationSearchService;
////import com.kh.quranapp.service.TranslationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/translations")
//public class TranslationController {
//
//    @Autowired
//    private TranslationService translationService;
//
//    @Autowired
//    private TranslationSearchService translationSearchService;
//
//    @GetMapping("/search")
//    public Object searchTranslation(
//            @RequestParam int sura,
//            @RequestParam int aya) {
//        return translationService.getTranslationBySuraAndAya(sura, aya);
//    }
//
//    @GetMapping("/search-by-text")
//    public Object searchTranslationByText(@RequestParam String query) {
//        return translationService.searchByText(query);
//    }
//
//    @GetMapping("/search-translations")
//    public List<Object> searchTranslations(@RequestParam String query) {
//        return translationSearchService.searchByText(query);
//    }
//}

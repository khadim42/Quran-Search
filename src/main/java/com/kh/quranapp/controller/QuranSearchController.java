//package com.kh.quranapp.controller;
//
//import com.kh.quranapp.entity.QuranWordSearch;
//import com.kh.quranapp.entity.TranslationSearch;
//import com.kh.quranapp.service.QuranSearchService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/search")
//public class QuranSearchController {
//
//    @Autowired
//    private QuranSearchService quranSearchService;
//
//    @GetMapping("/quran/search")
//    public String searchQuranWords(@RequestParam String query, Model model) {
//        List<QuranWordSearch> words = quranSearchService.searchQuranWords(query);
//        model.addAttribute("words", words);
//        model.addAttribute("query", query);
//        return "search";
//    }
//
//    @GetMapping("/quran/translation")
//    public String searchTranslations(@RequestParam String query, Model model) {
//        List<TranslationSearch> translations = quranSearchService.searchTranslations(query);
//        model.addAttribute("translations", translations);
//        model.addAttribute("query", query);
//        return "translation";
//    }
//}

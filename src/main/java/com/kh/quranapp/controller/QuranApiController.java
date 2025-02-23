package com.kh.quranapp.controller;


import com.kh.quranapp.entity.QuranWord;
//import com.kh.quranapp.entity.Translation;
import com.kh.quranapp.service.QuranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuranApiController {

    @Autowired
    private QuranService quranService;

    @GetMapping("/quran/search")
    public String searchQuranWords(@RequestParam String query, Model model) {
        List<QuranWord> words = quranService.searchWordsInElasticsearch(query);
        model.addAttribute("words", words);
        model.addAttribute("query", query);
        return "search";
    }

    @GetMapping("/quran/translation")
    public String searchTranslations(@RequestParam String query, Model model) {
//        List<Translation> translations = quranService.searchTranslationsInElasticsearch(query);
//        model.addAttribute("translations", translations);
        model.addAttribute("query", query);
        return "translation";
    }
}

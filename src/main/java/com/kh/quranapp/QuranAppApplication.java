package com.kh.quranapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.kh.quranapp.repository")
public class QuranAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuranAppApplication.class, args);
    }

}

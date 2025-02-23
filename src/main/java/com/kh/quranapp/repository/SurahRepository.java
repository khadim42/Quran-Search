package com.kh.quranapp.repository;

import com.kh.quranapp.entity.Surah;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurahRepository extends JpaRepository<Surah, Long> {
    List<Surah> findByNameEnContaining(String query);
}


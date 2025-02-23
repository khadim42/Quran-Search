package com.kh.quranapp.repository;

import com.kh.quranapp.entity.Ayah;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AyahRepository extends JpaRepository<Ayah, Long> {
    List<Ayah> findByTextContaining(String query);
}


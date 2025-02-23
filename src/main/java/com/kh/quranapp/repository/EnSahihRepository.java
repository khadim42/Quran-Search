package com.kh.quranapp.repository;

// EnSahihRepository.java
import com.kh.quranapp.entity.EnSahih;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnSahihRepository extends JpaRepository<EnSahih, Integer> {
    EnSahih findBySuraAndAya(int sura, int aya);

    List<EnSahih> findByTextContaining(String query);
}


package com.kh.quranapp.repository;

import com.kh.quranapp.entity.UrJalandhry;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrJalandhryRepository extends JpaRepository<UrJalandhry, Integer> {


    UrJalandhry findBySuraAndAya(int sura, int aya);
}


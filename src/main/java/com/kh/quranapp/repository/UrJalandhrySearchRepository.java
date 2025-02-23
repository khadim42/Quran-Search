//package com.kh.quranapp.repository;
//
//import com.kh.quranapp.entity.UrJalandhry;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
////@Repository
//public interface UrJalandhrySearchRepository extends ElasticsearchRepository<UrJalandhry, Long> {
//    List<UrJalandhry> findByTextContaining(String query);
//    // Use the standard delete method, no need for refreshPolicy
//    void deleteById(Long id);  // Deletes by ID
////    void delete(UrJalandhry entity);  // Deletes by entity
//
//}
//

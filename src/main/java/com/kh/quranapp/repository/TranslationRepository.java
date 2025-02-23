//package com.kh.quranapp.repository;
//
//import com.kh.quranapp.entity.Translation;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface TranslationRepository extends JpaRepository<Translation, String> {
//    List<Translation> findByTextContaining(String text);
////    public void deleteById(Long id);  // To delete by ID
////    public void delete(Translation translation);  // To delete the given entity
//// Correct method signatures for delete
////void deleteById(Long id);  // Delete by ID
////    void delete(Translation translation);  // Delete by entity
//
//}
//

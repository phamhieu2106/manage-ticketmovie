package com.example.datvexemphim.repositories;

import com.example.datvexemphim.dto.reponse.NgonNguResponse;
import com.example.datvexemphim.entities.NgonNgu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NgonNguRepository extends JpaRepository<NgonNgu,Long> {

    @Query(value = "SELECT Id,Ten FROM NgonNgu",nativeQuery = true)
    List<NgonNguResponse> getAll();
}

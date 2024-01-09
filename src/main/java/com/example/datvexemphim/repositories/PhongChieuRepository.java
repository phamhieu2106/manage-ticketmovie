package com.example.datvexemphim.repositories;

import com.example.datvexemphim.dto.reponse.PhongChieuResponse;
import com.example.datvexemphim.entities.PhongChieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhongChieuRepository extends JpaRepository<PhongChieu,Long> {

    @Query(value = "",nativeQuery = true)
    List<PhongChieuResponse> getAll();
}

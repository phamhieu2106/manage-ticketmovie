package com.example.datvexemphim.repositories;

import com.example.datvexemphim.dto.reponse.SuatChieuResponse;
import com.example.datvexemphim.entities.SuatChieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuatChieuRepository extends JpaRepository<SuatChieu,Long> {

    @Query(value = "",nativeQuery = true)
    List<SuatChieuResponse> getAll();
}

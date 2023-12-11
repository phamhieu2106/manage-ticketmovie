package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.SuatChieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuatChieuRepository extends JpaRepository<SuatChieu,Long> {
}

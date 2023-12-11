package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.PhongChieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongChieuRepository extends JpaRepository<PhongChieu,Long> {
}

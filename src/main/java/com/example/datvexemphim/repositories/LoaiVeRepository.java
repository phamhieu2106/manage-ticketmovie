package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.LoaiVe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiVeRepository extends JpaRepository<LoaiVe,Long> {
}

package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.VeXemPhim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeXemPhimRepository extends JpaRepository<VeXemPhim,Long> {
}

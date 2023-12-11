package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.Phim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhimRepository extends JpaRepository<Phim,Long> {
}

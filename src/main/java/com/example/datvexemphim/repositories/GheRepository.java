package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.Ghe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GheRepository extends JpaRepository<Ghe,Long> {
}

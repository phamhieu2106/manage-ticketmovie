package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheLoaiRepository extends JpaRepository<TheLoai,Long> {
}

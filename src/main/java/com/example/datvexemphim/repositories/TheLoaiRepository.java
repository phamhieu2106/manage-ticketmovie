package com.example.datvexemphim.repositories;

import com.example.datvexemphim.dto.reponse.TheLoaiResponse;
import com.example.datvexemphim.entities.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheLoaiRepository extends JpaRepository<TheLoai,Long> {

    @Query(value = "",nativeQuery = true)
    List<TheLoaiResponse> getAll();
}

package com.example.datvexemphim.repositories;

import com.example.datvexemphim.entities.VeXemPhim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeXemPhimRepository extends JpaRepository<VeXemPhim,Long> {

    @Query(value = "",nativeQuery = true)
    List<VeXemPhim> getAll();
}

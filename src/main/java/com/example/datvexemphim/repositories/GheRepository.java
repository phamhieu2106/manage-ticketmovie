package com.example.datvexemphim.repositories;

import com.example.datvexemphim.dto.reponse.GheResponse;
import com.example.datvexemphim.entities.Ghe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GheRepository extends JpaRepository<Ghe,Long> {

    @Query(value = "SELECT g.Id, g.Ma, g.LoaiGhe FROM GHE g;",nativeQuery = true)
    List<GheResponse> getAll();
}

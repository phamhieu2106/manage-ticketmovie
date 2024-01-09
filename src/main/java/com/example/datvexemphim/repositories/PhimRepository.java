package com.example.datvexemphim.repositories;

import com.example.datvexemphim.dto.reponse.PhimChiTietResponse;
import com.example.datvexemphim.entities.Phim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhimRepository extends JpaRepository<Phim,Long> {

    @Query(value = "SELECT p.Id, p.Ten, p.TenDaoDien, p.TenDienVien, p.ThoiLuong, p.GiaTien ,p.Poster" +
            ", tl.Ten, nn.Ten" +
            " FROM Phim p \n" +
            "JOIN TheLoai tl ON tl.Id = p.IdTheLoai\n" +
            "JOIN NgonNgu nn ON nn.Id = p.IdNgonNgu",nativeQuery = true)
    List<PhimChiTietResponse> getAll();
}

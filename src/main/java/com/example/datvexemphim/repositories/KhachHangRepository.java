package com.example.datvexemphim.repositories;

import com.example.datvexemphim.dto.reponse.KhachHangReponse;
import com.example.datvexemphim.entities.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Long> {

    @Query(value = "select kh.Id, kh.MaKhach, kh.HoTen, kh.SDT, kh.Email FROM KhachHang kh;",nativeQuery = true)
    List<KhachHangReponse> getAll();
}

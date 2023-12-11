package com.example.datvexemphim.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "phim")
public class Phim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "TenPhim")
    private String tenPhim;

    @Column(name = "TenDaoDien")
    private String tenDaoDien;

    @Column(name = "TenDienVien")
    private String tenDienVien;

    @Column(name = "NgonNgu")
    private String ngonNgu;

    @Column(name = "ThoiLuong")
    private int thoiLuong;
}

package com.example.datvexemphim.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "phimchitiet")
public class Phim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "TenDaoDien")
    private String tenDaoDien;

    @Column(name = "TenDienVien")
    private String tenDienVien;

    @Column(name = "ThoiLuong")
    private Integer thoiLuong;

    @Column(name = "GiaTien")
    private Double giaTien;

    @Column(name = "Poster")
    private String poster;

    @JoinColumn(name = "IdNgonNgu",referencedColumnName = "Id")
    @ManyToOne
    private NgonNgu ngonNgu;

    @JoinColumn(name = "IdTheLoai",referencedColumnName = "Id")
    @ManyToOne
    private TheLoai theLoai;
}

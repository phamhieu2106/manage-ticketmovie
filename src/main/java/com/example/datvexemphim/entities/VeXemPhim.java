package com.example.datvexemphim.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "vexemphim")
public class VeXemPhim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "MaSuatChieu")
    @OneToMany(mappedBy = "veXemPhim")
    private List<VeXemPhimSuatChieu> suatChieu;

    @JoinColumn(name = "MaLoaiVe",referencedColumnName = "Ma")
    @OneToOne
    private LoaiVe loaiVe;

    @JoinColumn(name = "MaKhachHang",referencedColumnName = "MaKhach")
    @ManyToOne(fetch = FetchType.LAZY)
    private KhachHang khachHang;

    @JoinColumn(name = "MaNhanVien",referencedColumnName = "Ma")
    @ManyToOne(fetch = FetchType.LAZY)
    private NhanVien nhanVien;

    @Column(name = "GioTao")
    private Date gioTao;

    @Column(name = "GiaVe")
    private Double giaVe;

    @Column(name = "TrangThai")
    private int trangThai;
}

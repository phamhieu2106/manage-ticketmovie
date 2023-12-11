package com.example.datvexemphim.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Cleanup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.naming.Name;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "suatchieu")
public class SuatChieu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "MaPhim")
    @JoinColumn(name = "MaPhim",referencedColumnName = "Ma")
    @ManyToOne(fetch = FetchType.LAZY)
    private Phim phim;

    @Column(name = "MaPhongChieu")
    @JoinColumn(name = "MaPhongChieu",referencedColumnName = "Ma")
    @ManyToOne(fetch = FetchType.LAZY)
    private PhongChieu phongChieu;

    @Column(name = "NgayGio")
    private Date ngayGio;
}

package com.example.datvexemphim.entities;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    private Long id;

    @JoinColumn(name = "IdPhimChiTiet",referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Phim phim;

    @JoinColumn(name = "IdPhongChieu",referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PhongChieu phongChieu;

    @Column(name = "NgayGioChieu")
    private Date ngayGio;
}

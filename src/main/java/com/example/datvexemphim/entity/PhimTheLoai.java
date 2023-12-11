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
public class PhimTheLoai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "MaTheLoai")
    @JoinColumn(name = "MaTheLoai",referencedColumnName = "Ma")
    @ManyToOne(fetch = FetchType.LAZY)
    private TheLoai theLoai;

    @Column(name = "MaPhim")
    @JoinColumn(name = "MaPhim",referencedColumnName = "Ma")
    @ManyToOne(fetch = FetchType.LAZY)
    private Phim phim;
}

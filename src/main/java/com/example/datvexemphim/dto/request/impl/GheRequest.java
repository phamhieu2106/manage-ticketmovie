package com.example.datvexemphim.dto.request.impl;

import com.example.datvexemphim.dto.request.IRequest;
import com.example.datvexemphim.entities.Ghe;
import com.example.datvexemphim.entities.PhongChieu;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NotNull
public class GheRequest implements IRequest<Ghe> {

    private Long id;

    private String ma;

    private String loaiGhe;

    private Double giaTien;

    private PhongChieu phongChieu;

    @Override
    public Ghe map(Ghe ghe){
        ghe.setId(this.id);
        ghe.setMa(this.ma);
        ghe.setLoaiGhe(this.loaiGhe);
        ghe.setGiaTien(this.giaTien);
        ghe.setPhongChieu(this.phongChieu);
        return ghe;
    }
}

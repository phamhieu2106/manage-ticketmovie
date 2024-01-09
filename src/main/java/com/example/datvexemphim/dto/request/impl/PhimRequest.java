package com.example.datvexemphim.dto.request.impl;

import com.example.datvexemphim.dto.request.IRequest;
import com.example.datvexemphim.entities.NgonNgu;
import com.example.datvexemphim.entities.Phim;
import com.example.datvexemphim.entities.TheLoai;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NotNull
public class PhimRequest implements IRequest<Phim> {

    private Long id;

    private String ten;

    private String tenDaoDien;

    private String tenDienVien;

    private Integer thoiLuong;

    private Double giaTien;

    private String poster;

    private NgonNgu ngonNgu;

    private TheLoai theLoai;
    @Override
    public Phim map(Phim object) {

        object.setId(this.id);
        object.setTen(this.ten);
        object.setTenDaoDien(this.tenDienVien);
        object.setTenDienVien(this.tenDienVien);
        object.setThoiLuong(this.thoiLuong);
        object.setGiaTien(this.giaTien);
        object.setPoster(this.poster);
        object.setNgonNgu(this.ngonNgu);
        object.setTheLoai(this.theLoai);

        return object;
    }
}

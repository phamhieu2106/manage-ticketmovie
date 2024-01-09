package com.example.datvexemphim.dto.request.impl;

import com.example.datvexemphim.dto.request.IRequest;
import com.example.datvexemphim.entities.Phim;
import com.example.datvexemphim.entities.PhongChieu;
import com.example.datvexemphim.entities.SuatChieu;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
@Getter
@Setter
@ToString
@NotNull
public class SuatChieuRequest implements IRequest<SuatChieu> {

    private Long id;
    private Date ngayGioChieu;
    private PhongChieu phongChieu;
    private Phim phim;

    @Override
    public SuatChieu map(SuatChieu object) {
        object.setId(this.id);
        object.setNgayGio(this.ngayGioChieu);
        object.setPhongChieu(this.phongChieu);
        object.setPhim(this.phim);
        return object;
    }
}

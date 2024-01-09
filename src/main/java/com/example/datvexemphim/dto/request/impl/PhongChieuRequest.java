package com.example.datvexemphim.dto.request.impl;

import com.example.datvexemphim.dto.request.IRequest;
import com.example.datvexemphim.entities.PhongChieu;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NotNull
public class PhongChieuRequest implements IRequest<PhongChieu> {


    private Long id;

    private String ten;

    @Override
    public PhongChieu map(PhongChieu object) {

        object.setId(this.id);
        object.setTen(this.ten);

        return object;
    }
}

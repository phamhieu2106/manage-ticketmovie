package com.example.datvexemphim.dto.request.impl;

import com.example.datvexemphim.dto.request.IRequest;
import com.example.datvexemphim.entities.TheLoai;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NotNull
public class TheLoaiRequest implements IRequest<TheLoai> {

    private Long id;
    private String ten;

    @Override
    public TheLoai map(TheLoai object) {
        object.setId(this.id);
        object.setTen(this.ten);
        return object;
    }
}

package com.example.datvexemphim.dto.request;

import com.example.datvexemphim.entities.Ghe;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NotNull
public class GheRequest {

    private Long id;

    private String ma;

    private String loaiGhe;

    public Ghe map(Ghe ghe){
        ghe.setId(this.id);
        ghe.setMa(this.ma);
        ghe.setLoaiGhe(this.loaiGhe);
        return ghe;
    }
}

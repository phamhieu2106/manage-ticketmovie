package com.example.datvexemphim.dto.request;

import com.example.datvexemphim.entities.KhachHang;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KhachHangRequest {

    private Long id;
    private String maKhach;
    private String hoTen;
    private String sdt;
    private String email;

    public KhachHang map(KhachHang khachHang){

        khachHang.setId(this.id);
        khachHang.setMa(this.maKhach);
        khachHang.setHoTen(this.hoTen);
        khachHang.setSdt(this.sdt);
        khachHang.setEmail(this.email);

        return khachHang;
    }
}

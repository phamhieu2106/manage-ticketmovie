package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.SuatChieu;
import com.example.datvexemphim.repositories.SuatChieuRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuatChieuServiceImpl implements IService<SuatChieu,SuatChieu,SuatChieu> {

    private SuatChieuRepository repository;

    @Autowired
    public SuatChieuServiceImpl(SuatChieuRepository repository){
        this.repository = repository;
    }

    @Override
    public List<SuatChieu> getAll() {
        return null;
    }

    @Override
    public SuatChieu add(SuatChieu object) {
        return null;
    }

    @Override
    public SuatChieu update(Long id, SuatChieu object) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}

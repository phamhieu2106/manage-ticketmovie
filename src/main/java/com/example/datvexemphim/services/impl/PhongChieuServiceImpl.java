package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.PhongChieu;
import com.example.datvexemphim.repositories.PhongChieuRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongChieuServiceImpl implements IService<PhongChieu,PhongChieu,PhongChieu> {

    private PhongChieuRepository repository;

    @Autowired
    public PhongChieuServiceImpl(PhongChieuRepository repository){
        this.repository = repository;
    }

    @Override
    public List<PhongChieu> getAll() {
        return null;
    }

    @Override
    public PhongChieu add(PhongChieu object) {
        return null;
    }

    @Override
    public PhongChieu update(Long id, PhongChieu object) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}

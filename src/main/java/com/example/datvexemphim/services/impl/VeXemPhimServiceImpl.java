package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.VeXemPhim;
import com.example.datvexemphim.repositories.VeXemPhimRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeXemPhimServiceImpl implements IService<VeXemPhim,VeXemPhim,VeXemPhim> {

    private VeXemPhimRepository repository;

    @Autowired
    public VeXemPhimServiceImpl(VeXemPhimRepository repository){
        this.repository = repository;
    }

    @Override
    public List<VeXemPhim> getAll() {
        return null;
    }

    @Override
    public VeXemPhim add(VeXemPhim object) {
        return null;
    }

    @Override
    public VeXemPhim update(Long id, VeXemPhim object) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}

package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.LoaiVe;
import com.example.datvexemphim.repositories.LoaiVeRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiVeServiceImpl implements IService<LoaiVe,LoaiVe,LoaiVe> {


    private LoaiVeRepository repository;

    @Autowired
    public LoaiVeServiceImpl(LoaiVeRepository repository){
        this.repository = repository;
    }

    @Override
    public List<LoaiVe> getAll() {
        return null;
    }

    @Override
    public LoaiVe add(LoaiVe object) {
        return null;
    }

    @Override
    public LoaiVe update(Long id, LoaiVe object) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}

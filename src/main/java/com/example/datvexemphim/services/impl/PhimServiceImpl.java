package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.Phim;
import com.example.datvexemphim.repositories.PhimRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhimServiceImpl implements IService<Phim,Phim,Phim> {

    private PhimRepository repository;

    @Autowired
    public PhimServiceImpl(PhimRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Phim> getAll() {
        return null;
    }

    @Override
    public Phim add(Phim object) {
        return null;
    }

    @Override
    public Phim update(Long id, Phim object) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}

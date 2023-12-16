package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.TheLoai;
import com.example.datvexemphim.repositories.TheLoaiRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheLoaiServiceImpl implements IService<TheLoai,TheLoai,TheLoai> {

    private TheLoaiRepository repository;

    @Autowired
    public TheLoaiServiceImpl(TheLoaiRepository repository){
        this.repository = repository;
    }

    @Override
    public List<TheLoai> getAll() {
        return null;
    }

    @Override
    public TheLoai add(TheLoai object) {
        return null;
    }

    @Override
    public TheLoai update(Long id, TheLoai object) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}

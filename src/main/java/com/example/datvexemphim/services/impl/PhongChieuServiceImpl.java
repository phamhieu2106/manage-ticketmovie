package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.PhongChieu;
import com.example.datvexemphim.repositories.PhongChieuRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongChieuServiceImpl implements IService<PhongChieu,PhongChieu,PhongChieu> {

    private PhongChieuRepository repository;

    @Autowired
    public PhongChieuServiceImpl(PhongChieuRepository repository){
        this.repository = repository;
    }

    @Override
    public List<PhongChieu> getAll() {
        return repository.findAll();
    }

    @Override
    public PhongChieu add(PhongChieu object) {
        return repository.save(object);
    }

    @Override
    public PhongChieu update(Long id, PhongChieu object) {
        Optional<PhongChieu> optional = repository.findById(id);
        if(!optional.isEmpty()){
            object.setId(id);
            return repository.save(object);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<PhongChieu> optional = repository.findById(id);
        if(!optional.isEmpty()){
            repository.delete(optional.get());
        }
    }
}

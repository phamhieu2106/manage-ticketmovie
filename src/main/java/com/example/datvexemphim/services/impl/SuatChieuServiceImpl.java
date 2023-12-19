package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.SuatChieu;
import com.example.datvexemphim.repositories.SuatChieuRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuatChieuServiceImpl implements IService<SuatChieu,SuatChieu,SuatChieu> {

    private SuatChieuRepository repository;

    @Autowired
    public SuatChieuServiceImpl(SuatChieuRepository repository){
        this.repository = repository;
    }

    @Override
    public List<SuatChieu> getAll() {
        return repository.findAll();
    }

    @Override
    public SuatChieu add(SuatChieu object) {
        return repository.save(object);
    }

    @Override
    public SuatChieu update(Long id, SuatChieu object) {
        Optional<SuatChieu> optional = repository.findById(id);
        if(!optional.isEmpty()){
            object.setId(id);
            return repository.save(object);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<SuatChieu> optional = repository.findById(id);
        if(!optional.isEmpty()){
            repository.delete(optional.get());
        }
    }
}

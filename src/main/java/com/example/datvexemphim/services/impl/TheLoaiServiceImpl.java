package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.TheLoai;
import com.example.datvexemphim.repositories.TheLoaiRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TheLoaiServiceImpl implements IService<TheLoai,TheLoai,TheLoai> {

    private TheLoaiRepository repository;

    @Autowired
    public TheLoaiServiceImpl(TheLoaiRepository repository){
        this.repository = repository;
    }

    @Override
    public List<TheLoai> getAll() {
        return repository.findAll();
    }

    @Override
    public TheLoai add(TheLoai object) {
        return repository.save(object);
    }

    @Override
    public TheLoai update(Long id, TheLoai object) {
        Optional<TheLoai> optional = repository.findById(id);
        if(!optional.isEmpty()){
            object.setId(id);
            return repository.save(object);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<TheLoai> optional = repository.findById(id);
        if(!optional.isEmpty()){
            repository.delete(optional.get());
        }
    }
}

package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.Phim;
import com.example.datvexemphim.repositories.PhimRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhimServiceImpl implements IService<Phim,Phim,Phim> {

    private PhimRepository repository;

    @Autowired
    public PhimServiceImpl(PhimRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Phim> getAll() {
        return repository.findAll();
    }

    @Override
    public Phim add(Phim object) {
        return repository.save(object);
    }

    @Override
    public Phim update(Long id, Phim object) {
        Optional<Phim> optional = repository.findById(id);
        if(!optional.isEmpty()){
            object.setId(id);
            return repository.save(object);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<Phim> optional = repository.findById(id);
        if(!optional.isEmpty()){
            repository.delete(optional.get());
        }
    }
}

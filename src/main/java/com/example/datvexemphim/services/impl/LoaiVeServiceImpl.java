package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.LoaiVe;
import com.example.datvexemphim.repositories.LoaiVeRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiVeServiceImpl implements IService<LoaiVe,LoaiVe,LoaiVe> {


    private LoaiVeRepository repository;

    @Autowired
    public LoaiVeServiceImpl(LoaiVeRepository repository){
        this.repository = repository;
    }

    @Override
    public List<LoaiVe> getAll() {
        return repository.findAll();
    }

    @Override
    public LoaiVe add(LoaiVe object) {
        if(!(object == null)){
            return repository.save(object);
        }
        return null;
    }

    @Override
    public LoaiVe update(Long id, LoaiVe object) {
        Optional<LoaiVe> optional = repository.findById(id);
        if(!optional.isEmpty()){
            object.setId(id);
            return repository.save(object);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<LoaiVe> optional = repository.findById(id);
        if(!optional.isEmpty()){
            repository.delete(optional.get());
        }
    }
}

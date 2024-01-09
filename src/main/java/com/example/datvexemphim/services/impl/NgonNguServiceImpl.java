package com.example.datvexemphim.services.impl;


import com.example.datvexemphim.dto.reponse.NgonNguResponse;
import com.example.datvexemphim.dto.request.impl.NgonNguRequest;
import com.example.datvexemphim.entities.NgonNgu;
import com.example.datvexemphim.repositories.NgonNguRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NgonNguServiceImpl implements IService<NgonNguResponse, NgonNguRequest, NgonNgu>{

    private NgonNguRepository repository;

    @Autowired
    public NgonNguServiceImpl(NgonNguRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<NgonNguResponse> getAll() {
        return repository.getAll();
    }

    @Override
    public NgonNgu add(NgonNguRequest object) {

        NgonNgu ngonNgun = object.map(new NgonNgu());

        return ngonNgun;
    }

    @Override
    public NgonNgu update(Long id, NgonNguRequest object) {

        Optional<NgonNgu> optional = repository.findById(id);

        if(!optional.isEmpty()){
            NgonNgu newNgonNgu = object.map(new NgonNgu());
            newNgonNgu.setId(id);
            return repository.save(newNgonNgu);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<NgonNgu> optional = repository.findById(id);
        if(optional.isPresent()){
            repository.delete(optional.get());
        }
    }
}

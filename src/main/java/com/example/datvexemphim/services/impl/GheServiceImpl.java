package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.dto.request.impl.GheRequest;
import com.example.datvexemphim.dto.reponse.GheResponse;
import com.example.datvexemphim.entities.Ghe;
import com.example.datvexemphim.repositories.GheRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GheServiceImpl implements IService<GheResponse, GheRequest, Ghe> {

    private GheRepository repository;

    @Autowired
    public GheServiceImpl(GheRepository repository){
        this.repository = repository;
    }

    @Override
    public List<GheResponse> getAll() {
        return repository.getAll();
    }

    @Override
    public Ghe add(GheRequest object) {

        Ghe ghe = object.map(new Ghe());
        return repository.save(ghe);
    }

    @Override
    public Ghe update(Long id, GheRequest object) {
        Optional<Ghe> optional = repository.findById(id);
        if(optional.isPresent()){
            Ghe ghe = optional.get();

            //update
            Ghe newGhe = object.map(ghe);
            //update to database
            return repository.save(newGhe);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<Ghe> optional = repository.findById(id);
        if(optional.isPresent()){
            repository.delete(optional.get());
        }
    }
}

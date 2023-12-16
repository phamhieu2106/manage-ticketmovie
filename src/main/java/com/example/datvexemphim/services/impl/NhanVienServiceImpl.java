package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.entities.NhanVien;
import com.example.datvexemphim.repositories.NhanVienRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienServiceImpl implements IService<NhanVien,NhanVien,NhanVien> {

    private NhanVienRepository repository;

    @Autowired
    public NhanVienServiceImpl(NhanVienRepository repository){
        this.repository = repository;
    }

    @Override
    public List<NhanVien> getAll() {
        return repository.findAll();
    }

    @Override
    public NhanVien add(NhanVien object) {
        return repository.save(object);
    }

    @Override
    public NhanVien update(Long id, NhanVien object) {
        Optional<NhanVien> optional = repository.findById(id);
        if(optional.isPresent()) {
            return repository.save(object);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<NhanVien> optional = repository.findById(id);
        if(optional.isPresent()){
            repository.delete(optional.get());
        }
    }
}

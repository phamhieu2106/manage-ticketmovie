package com.example.datvexemphim.services.impl;

import com.example.datvexemphim.dto.reponse.KhachHangReponse;
import com.example.datvexemphim.dto.request.KhachHangRequest;
import com.example.datvexemphim.entities.KhachHang;
import com.example.datvexemphim.repositories.KhachHangRepository;
import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements IService<KhachHangReponse, KhachHangRequest, KhachHang> {

    private KhachHangRepository repository;

    @Autowired
    public KhachHangServiceImpl(KhachHangRepository repository){
        this.repository = repository;
    }

    @Override
    public List<KhachHangReponse> getAll() {
        return repository.getAll();
    }

    @Override
    public KhachHang add(KhachHangRequest object) {
        KhachHang kh = object.map(new KhachHang());
        return repository.save(kh);
    }

    @Override
    public KhachHang update(Long id, KhachHangRequest object) {
        Optional<KhachHang> optional = repository.findById(id);
        if(optional.isPresent()){
            KhachHang kh = optional.get();

            KhachHang newKH = object.map(kh);

            return repository.save(newKH);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        Optional<KhachHang> optional = repository.findById(id);
        if(optional.isPresent()){
            repository.delete(optional.get());
        }
    }
}

package com.example.datvexemphim.services;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IService <P,Q,M>{

    List<P> getAll();

    M add(Q object);

    M update(Long id,Q object);

    void remove(Long id);

}

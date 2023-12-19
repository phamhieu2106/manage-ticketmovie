package com.example.datvexemphim.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
public interface IController <Q>{

    ResponseEntity<?> getAll();

    ResponseEntity<?> add(Q entity, BindingResult result);

    ResponseEntity<?> update(Long id,Q entity,BindingResult result);

    ResponseEntity<?> remove(Long id);
}

package com.example.datvexemphim.controllers.impl;

import com.example.datvexemphim.controllers.IController;
import com.example.datvexemphim.dto.request.KhachHangRequest;
import com.example.datvexemphim.services.IService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/khachhangs")
public class KhachHangController implements IController<KhachHangRequest> {

    private IService service;

    @Autowired
    public KhachHangController(@Qualifier("khachHangServiceImpl") IService service){
        this.service = service;
    }

    @Override
    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @Override
    @PostMapping
    public ResponseEntity<?> add(@Valid @RequestBody KhachHangRequest entity, BindingResult result) {

        if (!result.hasErrors()) {
            if (entity == null) return ResponseEntity.badRequest().body("Null object");
            System.out.println(entity);
            service.add(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(entity);
        } else {
            return ResponseEntity.badRequest().body("Invalid request body");
        }
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id
            ,@Valid @RequestBody KhachHangRequest entity, BindingResult result) {
        return ResponseEntity.ok(service.update(id,entity));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable("id") Long id) {
        service.remove(id);
        return ResponseEntity.noContent().build();
    }
}

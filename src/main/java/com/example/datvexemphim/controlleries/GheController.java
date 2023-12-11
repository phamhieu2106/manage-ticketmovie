package com.example.datvexemphim.controlleries;

import com.example.datvexemphim.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GheController {

    private IService service;

    @Autowired
    public GheController(@Qualifier("gheServiceImpl") IService service){
        this.service = service;
    }

    @GetMapping("ghes")
    public ResponseEntity<?> getAll(){

        return ResponseEntity.ok(service.getAll());
    }
}

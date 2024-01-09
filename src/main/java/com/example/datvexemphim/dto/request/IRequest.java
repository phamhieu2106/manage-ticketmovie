package com.example.datvexemphim.dto.request;


import org.springframework.stereotype.Component;

@Component
public interface IRequest<O>{
    O map(O object);
}

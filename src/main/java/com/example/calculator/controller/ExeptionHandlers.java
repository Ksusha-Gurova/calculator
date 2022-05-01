package com.example.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExeptionHandlers {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ArithmeticException.class)
    public String handleArithmeticException (ArithmeticException e){
        return "Деление на ноль невозможно!";
    }
}

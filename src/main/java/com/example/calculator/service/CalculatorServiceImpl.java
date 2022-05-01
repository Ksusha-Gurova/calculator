package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Double sum(Double firstArg, Double secondArg) {
        return firstArg + secondArg;
    }

    @Override
    public Double sub(Double firstArg, Double secondArg) {
        return firstArg - secondArg;
    }

    @Override
    public Double mult(Double firstArg, Double secondArg) {
        return firstArg * secondArg;
    }

    @Override
    public Double div(Double firstArg, Double secondArg) {
        if (secondArg == 0){
            throw new ArithmeticException("Деление на ноль невозможно!");
        }
        return firstArg / secondArg;
    }
}

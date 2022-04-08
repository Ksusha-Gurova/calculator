package com.example.calculator.service;

@org.springframework.stereotype.Service
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
    public Object div(Double firstArg, Double secondArg) {
        if (secondArg == 0){
            return "Деление на ноль";
        }
        return firstArg / secondArg;
    }
}

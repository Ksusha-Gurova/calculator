package com.example.calculator.service;

public interface CalculatorService {
    Double sum(Double firstArg, Double secondArg);

    Double sub(Double firstArg, Double secondArg);

    Double mult(Double firstArg, Double secondArg);

    Object div(Double firstArg, Double secondArg);
}

package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/sum")
    public Double sum (@RequestParam Double firstArg, @RequestParam Double secondArg) {
        return calculatorService.sum(firstArg, secondArg);
    }

    @GetMapping("/sub")
    public Double sub (@RequestParam Double firstArg, @RequestParam Double secondArg) {
        return  calculatorService.sub(firstArg, secondArg);
    }

    @GetMapping("/mult")
    public Double mult (@RequestParam Double firstArg, @RequestParam Double secondArg) {
        return calculatorService.mult(firstArg,secondArg);
    }

    @GetMapping("/div")
    public Double div (@RequestParam Double firstArg, @RequestParam Double secondArg) {
        return calculatorService.div(firstArg, secondArg);
    }
}

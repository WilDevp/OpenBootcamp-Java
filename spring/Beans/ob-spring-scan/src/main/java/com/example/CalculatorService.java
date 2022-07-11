package com.example;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public CalculatorService() {
        System.out.println("Text constructor CalculatorService");
    }

    public String holaMundo(){
        return "Hola Mundo";
    }
}

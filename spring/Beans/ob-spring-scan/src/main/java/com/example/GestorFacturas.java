package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {

    //Atributos

    CalculatorService calculatorService;


    //Constructor
    public GestorFacturas(CalculatorService calculatorService) {
        System.out.println("Ejecutando constructor de facturas");
        this.calculatorService = calculatorService;
    }

    //Metodos
}

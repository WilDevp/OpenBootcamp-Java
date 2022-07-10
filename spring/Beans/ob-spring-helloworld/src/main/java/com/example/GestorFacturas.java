package com.example;

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

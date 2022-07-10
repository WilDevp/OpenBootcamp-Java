package com.example;

public class GestorFacturas {

    //Atributos

    CalculatorService calculatorService;
    String nombre;

    //Constructor
    public GestorFacturas(CalculatorService calculatorService, String nombre) {
        System.out.println("Ejecutando constructor de facturas");
        this.calculatorService = calculatorService;
        this.nombre = nombre;
    }

    //Metodos
}

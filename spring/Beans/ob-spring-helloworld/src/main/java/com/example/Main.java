package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //Agregamos el container para llamar los beans

        //Ejemplo 1
        //Opciòn 1: Crear un objeto de una forma normal
        //CalculatorService calculatorService  = new CalculatorService();

        //Opciòn 2: Recibir un objeto de Spring
        CalculatorService service = (CalculatorService) context.getBean("calculatorService"); //Hacemos el llamado al bean, el cual crearà el objeto y lo inyectamos

        String texto = service.holaMundo();
        System.out.println(texto);

        //Se puede volver a obtener
        //OJO: se recupera el mismo objeto

        CalculatorService service2 = (CalculatorService) context.getBean("calculatorService"); //Hacemos el llamado al bean, el cual crearà el objeto y lo inyectamos

        String texto2 = service.holaMundo();
        System.out.println(texto2);

        //Ejemplo 2
        GestorFacturas gestorFacturas = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestorFacturas.calculatorService.holaMundo());
    }
}

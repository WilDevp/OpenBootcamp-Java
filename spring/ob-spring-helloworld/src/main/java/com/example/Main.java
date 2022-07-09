package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //Agregamos el container para llamar los beans

        CalculatorService service = (CalculatorService) context.getBean("calculatorService"); //Hacemos el llamado al bean, el cual crearà el objeto y lo inyectamos

        String texto = service.holaMundo();
        System.out.println(texto);
    }
}

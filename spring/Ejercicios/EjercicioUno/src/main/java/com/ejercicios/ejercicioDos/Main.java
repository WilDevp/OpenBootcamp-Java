package com.ejercicios.ejercicioDos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanDos.xml"); // Hacemos el llamado al archivo beanDos.xml
        UserService userService = (UserService) context.getBean("userService");

        String text = userService.service.imprimirSaludo();
        System.out.println(text);


    }
}

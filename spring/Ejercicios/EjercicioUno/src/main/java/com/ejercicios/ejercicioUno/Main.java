package com.ejercicios.ejercicioUno;

/*
Ejercicio 1

Crear proyecto maven con la dependencia spring-context y crear una clase Saludo con un método imprimirSaludo que imprima un texto por consola.

Crear el archivo beans.xml con un bean para la clase Saludo.

Obtener el bean desde el método main y ejecutar el método imprimirSaludo.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml"); // Hacemos el llamado al archivo bean.xml

        Saludo saludo = (Saludo) context.getBean("saludo"); // Creacmos el objeto y hacemos el llamado al bean con el id indicado a la clase

        String hello = saludo.saludo(); // Guardamos el saludo en una variable y lo imprimimos
        System.out.println(hello);
    }
}

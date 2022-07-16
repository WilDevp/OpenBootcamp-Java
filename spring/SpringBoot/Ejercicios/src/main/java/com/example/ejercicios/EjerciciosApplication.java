package com.example.ejercicios;

import com.example.ejercicios.entity.Laptop;
import com.example.ejercicios.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciosApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(EjerciciosApplication.class, args);

        LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);
        Laptop laptop = new Laptop(null, "Asus", "2012",1,30.000);

        laptopRepository.save(laptop);

        System.out.println("Cantidad de laptos: "+ laptopRepository.findAll().size());
    }

}

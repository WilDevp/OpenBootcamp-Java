package com.example.ejerciciostres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciosTresApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(EjerciciosTresApplication.class, args);

       AnimalRepository repository = context.getBean(AnimalRepository.class); //Hacemos el llamado al bean

        System.out.println("El numero de animales en la base de datos es: " + repository.count()); //Probamos si nos hace la consulta

        AnimalModel animalModel = new AnimalModel(null, 1, "Ares","Mestizo"); //Creamos un objeto
        repository.save(animalModel);// Guardamos el objeto

        System.out.println("El numero de animales en la base de datos es: " + repository.count()); //Consultamos nuevamente

        System.out.println(repository.findById(1L)); //Buscamos por ID
    }

}

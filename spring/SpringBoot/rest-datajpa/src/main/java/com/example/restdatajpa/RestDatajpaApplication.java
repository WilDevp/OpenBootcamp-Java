package com.example.restdatajpa;

import com.example.restdatajpa.model.Book;
import com.example.restdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class RestDatajpaApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(RestDatajpaApplication.class, args);
        BookRepository repository = context.getBean(BookRepository.class);

       // CRUD
        // Crear libro
        Book book = new Book(null,"Java", "Wil",300,30.00, LocalDate.of(2019,12,1),true);
        Book book2 = new Book(null,"JavaScript", "Sha",300,30.00, LocalDate.of(2019,12,1),true);
        // almacenar un libro
        repository.save(book);
        repository.save(book2);
        // buscar libros
        System.out.println("Num libros en base de datos: "+repository.findAll().size());
        // Borrar un libro
        repository.deleteById(1L);

        System.out.println("Num libros en base de datos: "+repository.findAll().size());
    }

}

package com.example.restdatajpa.controller;

import com.example.restdatajpa.model.Book;
import com.example.restdatajpa.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    // Atributos
    private BookRepository repository;

    //Constructor

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    // CRUD sobre la entidad Book

    /**
     * http://localhost:8080/api/books
     * @return
     */
    //Buscar todos los libros
    @GetMapping("/api/books")
    public List<Book> findAll(){
        //Recuperar y devolver los libros de la base de datos
        return repository.findAll();
    }

    /**
     * http://localhost:8080/api/book/1
     *
     * @return
     */
    //Buscar por un book por Id
//    @GetMapping("/api/book/{id}")
//    public Book findById(Long id){
//        return repository.findById(id);
//    }
}

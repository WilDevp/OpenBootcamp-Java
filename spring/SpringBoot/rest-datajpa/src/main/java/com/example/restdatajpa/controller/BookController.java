package com.example.restdatajpa.controller;

import com.example.restdatajpa.model.Book;
import com.example.restdatajpa.repository.BookRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
     * http://localhost:8080/api/books/1
     *
     * @return
     */
    //Buscar por un book por Id
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
       Optional<Book> opBook =  repository.findById(id);

       //Opcion 1.
       /* if (opBook.isPresent())
            return opBook.get();
        else
            return null;*/
        //Opciion 2.
        //return opBook.orElse(null);

        //Opcion 3.
        if (opBook.isPresent())
            return ResponseEntity.ok(opBook.get());
        else
            return ResponseEntity.notFound().build();


        //Opcion 4.(Programaión funcional
        //return opBook.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * http://localhost:8080/api/books
     *
     * @return
     */

    //Guardar un libro
    @PostMapping("/api/books")
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        //Guardar el libro reibido
        return repository.save(book);

    }

    /**
     * http://localhost:8080/api/books
     *
     * @return
     */

    //Actualizar un libro existente


}

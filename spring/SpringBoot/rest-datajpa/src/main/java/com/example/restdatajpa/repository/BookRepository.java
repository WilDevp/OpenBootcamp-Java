package com.example.restdatajpa.repository;

import com.example.restdatajpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

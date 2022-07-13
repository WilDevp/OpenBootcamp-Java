package com.example.restdatajpa.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Book {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String autor;
    private Integer pages;
    private Double price;
    private LocalDate realeaseDate;
    private boolean online;

    //Constructores


    public Book() {
    }

    public Book(Long id, String title, String autor, Integer pages, Double price, LocalDate realeaseDate, boolean online) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.pages = pages;
        this.price = price;
        this.realeaseDate = realeaseDate;
        this.online = online;
    }

    //Getter y Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(LocalDate realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    //ToString
 /*   @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", realeaseDate=" + realeaseDate +
                ", online=" + online +
                '}';
    }*/
}

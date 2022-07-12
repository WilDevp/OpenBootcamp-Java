package com.example.obspringdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coche {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturing;
    private String model;
    private Integer year;

    //constructores
    public Coche() {
    }

    public Coche(Long id, String manufacturing, String model, Integer year) {
        this.id = id;
        this.manufacturing = manufacturing;
        this.model = model;
        this.year = year;
    }

    //getter and seeter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturing() {
        return manufacturing;
    }

    public void setManufacturing(String manufacturing) {
        this.manufacturing = manufacturing;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    //toString

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturing='" + manufacturing + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

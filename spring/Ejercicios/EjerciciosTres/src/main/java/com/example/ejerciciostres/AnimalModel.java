package com.example.ejerciciostres;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnimalModel {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int edad;
    private String nombre;
    private String raza;

    //Constructor
    public AnimalModel() {
    }

    public AnimalModel(Long id, int edad, String nombre, String raza) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    //Getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "AnimalModel{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}

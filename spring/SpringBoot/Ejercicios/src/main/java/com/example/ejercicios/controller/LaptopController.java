package com.example.ejercicios.controller;

import com.example.ejercicios.entity.Laptop;
import com.example.ejercicios.repository.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    //Call to interface
    LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    //List all lapatops
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    //Save laptop
    @PostMapping("/api/laptops")
    public Laptop save(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}

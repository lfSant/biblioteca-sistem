package com.ucacue.biblioteca.controller;


import com.ucacue.biblioteca.infraestructure.repository.AutorRepository;
import com.ucacue.biblioteca.model.Autor;
import com.ucacue.biblioteca.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//esto es un controlador
//el controlador esta actualizado con la base de datos 2
@Controller
@RestController
@RequestMapping("/api")
public class AutorController {

    @Autowired
    AutorRepository autorRepository;

    @GetMapping("/autores")
    public List<Autor> getAllAutor(){
        return autorRepository.findAll();
    }

    @GetMapping("/autores/{id}")
    public List<Libro> getLibroByAutor(@PathVariable int id){
        return autorRepository.findById(id).get().getLibros();

    }
}

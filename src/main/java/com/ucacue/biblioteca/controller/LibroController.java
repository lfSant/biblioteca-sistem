package com.ucacue.biblioteca.controller;

import com.ucacue.biblioteca.infraestructure.services.LibroService;
import com.ucacue.biblioteca.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping("/libros")
    ResponseEntity<List<Libro>> getAllLibros(){
        return ResponseEntity.ok(libroService.getLibros());
    }

    @PostMapping("/libros/nombre")
    ResponseEntity<List<Libro>> getLibrosByNombre(@RequestBody String nombre){
        return ResponseEntity.ok(libroService.getLibrosByNombre(nombre));
    }

    @PostMapping("/libros/autor")
    ResponseEntity<List<Libro>> getLibrosByAutor(@RequestBody String autor){
        return ResponseEntity.ok(libroService.getLibrosByAutor(autor));
    }

    @PostMapping("/libros/genero")
    ResponseEntity<List<Libro>> getLibrosByGenero(@RequestBody String genero){
        return ResponseEntity.ok(libroService.getLibrosByGenero(genero));
    }
}

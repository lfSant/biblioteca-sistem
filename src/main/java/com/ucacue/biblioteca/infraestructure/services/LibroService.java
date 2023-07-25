package com.ucacue.biblioteca.infraestructure.services;

import com.ucacue.biblioteca.infraestructure.repository.LibroRepository;
import com.ucacue.biblioteca.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.findAll();
    }

    public List<Libro> getLibrosByNombre(String nombre){
        return libroRepository.findByNombre(nombre);
    }

    public List<Libro> getLibrosByAutor(String autor){
        return libroRepository.findByAutor(autor);
    }

    public List<Libro> getLibrosByGenero(String genero){
        return libroRepository.findByGenero(genero);
    }
}

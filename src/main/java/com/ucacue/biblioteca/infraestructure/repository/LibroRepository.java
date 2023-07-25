package com.ucacue.biblioteca.infraestructure.repository;

import com.ucacue.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

    List<Libro> findByNombre(String nombre);
    List<Libro> findByAutor(String autor);
    List<Libro> findByGenero(String genero);

}

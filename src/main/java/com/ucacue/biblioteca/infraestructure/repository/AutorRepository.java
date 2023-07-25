package com.ucacue.biblioteca.infraestructure.repository;

import com.ucacue.biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
}

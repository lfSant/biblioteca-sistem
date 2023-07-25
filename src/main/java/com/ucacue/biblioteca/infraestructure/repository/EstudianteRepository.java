package com.ucacue.biblioteca.infraestructure.repository;

import com.ucacue.biblioteca.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Esto es un repositorio
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}

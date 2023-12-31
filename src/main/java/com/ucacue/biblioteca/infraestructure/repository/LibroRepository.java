package com.ucacue.biblioteca.infraestructure.repository;

import com.ucacue.biblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

    @Query("SELECT l FROM Libro l WHERE l.nombre LIKE %?1%")
    List<Libro> findByNombre(@Param("nombre") String nombre);

    @Query("SELECT l FROM Libro l WHERE l.autor LIKE %?1%")
    List<Libro> findByAutor(@Param("autor") String autor);

    @Query("SELECT l FROM Libro l WHERE l.genero LIKE %?1%")
    List<Libro> findByGenero(@Param("genero") String genero);
    Libro save(Libro libro);
}

package com.ucacue.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Este es mi cambio realizado en el modelo Docente :)
@Entity
@DiscriminatorValue("docente")
public class Docente extends Persona {

    private String titulo;
}

//este es un modelo docente
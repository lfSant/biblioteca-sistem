package com.ucacue.biblioteca.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@DiscriminatorValue("estudiante")
public class Estudiante extends Persona {

    private String carrera;
}

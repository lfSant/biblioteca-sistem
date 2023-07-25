package com.ucacue.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Date;


@Data
@Entity
@Table(name = "cabecera_reserva")
public class CabeceraReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    private Persona persona;
    private Date fechaReserva;

    @OneToMany(mappedBy = "cabeceraReserva")
    private List<DetalleReserva> detalleReserva;

}

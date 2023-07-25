package com.ucacue.biblioteca.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Date;

@Data
@Entity
@Table(name = "detalle_reserva")
public class DetalleReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Libro libro;
    private Date fechaEntrega;


    @Transient
    private int diasMoras;



    @JsonBackReference
    @ManyToOne
    private CabeceraReserva cabeceraReserva;


    public Date sumarDias(Date fecha, int dias) {
        Date fechaSumada = new Date();
        fechaSumada.setDate(fecha.getDate() + dias);
        return fechaSumada;
    }
    public void setDiasMoras() {
        Date fechaActual = new Date();
        int dias = (int) ((fechaActual.getTime() - fechaEntrega.getTime()) / 86400000);
        this.diasMoras = dias;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = sumarDias(fechaEntrega, 30);

    }

    public int calcularMora() {

        if (fechaEntrega.before(new Date())) {
            return 0;
        }else {
            //calcular dias de mora con la fecha actual y la fecha de entrega
            int diasMora = fechaEntrega.getDay() - new Date().getDay();
            return diasMora;
        }



    }
}

package com.ucacue.biblioteca.controller;

import com.ucacue.biblioteca.infraestructure.repository.CabeceraReservaRepository;
import com.ucacue.biblioteca.infraestructure.services.CabeceraReservaService;
import com.ucacue.biblioteca.model.CabeceraReserva;
import com.ucacue.biblioteca.model.DetalleReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class CabeceraReservaController {

    @Autowired
    CabeceraReservaRepository cabeceraReservaRepository;


    @Autowired
    CabeceraReservaService cabeceraReservaService;

    @GetMapping("/reservas")
    public List<CabeceraReserva> getAllCabeceraReserva(){
        List<CabeceraReserva> cabeceraReservas = cabeceraReservaRepository.findAll();
        for(CabeceraReserva cabeceraReserva : cabeceraReservas){
            for (DetalleReserva detalleReserva : cabeceraReserva.getDetalleReserva()){
                detalleReserva.setDiasMoras();
            }
        }
        return cabeceraReservaRepository.findAll();
    }
    @GetMapping("/reservas/mora")
    public List<DetalleReserva> ReservasMora()
    {
        return cabeceraReservaService.reservasMora();
    }
}

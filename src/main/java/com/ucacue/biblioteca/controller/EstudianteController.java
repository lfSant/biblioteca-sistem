package com.ucacue.biblioteca.controller;

import com.ucacue.biblioteca.infraestructure.repository.EstudianteRepository;
import com.ucacue.biblioteca.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class EstudianteController {

    @Autowired
    EstudianteRepository estudianteRepository;

    @GetMapping("/estudiantes")
    public List<Estudiante> getAllEstudiante(){
        return estudianteRepository.findAll();
    }
}

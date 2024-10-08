package com.example.bienestar_integral.controllers;

import com.example.bienestar_integral.models.Actividad;
import com.example.bienestar_integral.services.ActividadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actividades")
public class ActividadController {

    private final ActividadService actividadService;

    
    public ActividadController(ActividadService actividadService) {
        this.actividadService = actividadService;
    }

    @PostMapping
    public Actividad crearActividad(@RequestBody Actividad actividad) {
        return actividadService.crearActividad(actividad);
    }

    @GetMapping("/instructor/{instructorId}")
    public List<Actividad> obtenerActividadesPorInstructorId(@PathVariable String instructorId) {
        return actividadService.obtenerActividadesPorInstructorId(instructorId);
    }
}

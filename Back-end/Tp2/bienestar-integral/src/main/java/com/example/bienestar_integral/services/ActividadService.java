package com.example.bienestar_integral.services;

import com.example.bienestar_integral.models.Actividad;
import com.example.bienestar_integral.repositories.ActividadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadService {

    private final ActividadRepository actividadRepository;

    public ActividadService(ActividadRepository actividadRepository) {
        this.actividadRepository = actividadRepository;
    }

    public Actividad crearActividad(Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    public List<Actividad> obtenerActividadesPorInstructorId(String instructorId) {
        return actividadRepository.findByInstructorId(instructorId);
    }

    public Actividad obtenerActividadPorId(String id) {
        Optional<Actividad> actividad = actividadRepository.findById(id);
        return actividad.orElseThrow(() -> new RuntimeException("Actividad no encontrada"));
    }

}

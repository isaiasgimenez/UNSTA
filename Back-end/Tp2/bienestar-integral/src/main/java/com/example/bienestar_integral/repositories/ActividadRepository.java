package com.example.bienestar_integral.repositories;

import com.example.bienestar_integral.models.Actividad;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActividadRepository extends MongoRepository<Actividad, String> {
    List<Actividad> findByInstructorId(String instructorId); 
}

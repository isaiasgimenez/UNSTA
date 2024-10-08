package com.example.bienestar_integral.services;

import com.example.bienestar_integral.models.Instructor;
import com.example.bienestar_integral.repositories.InstructorRepository;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public Instructor crearInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

}

package com.example.bienestar_integral.controllers;

import com.example.bienestar_integral.models.Instructor;
import com.example.bienestar_integral.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/instructores")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping
    public Instructor crearInstructor(@RequestBody Instructor instructor) {
        return instructorService.crearInstructor(instructor);
    }

}

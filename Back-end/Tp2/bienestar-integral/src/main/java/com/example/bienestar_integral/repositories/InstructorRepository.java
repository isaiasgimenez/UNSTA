package com.example.bienestar_integral.repositories;

import com.example.bienestar_integral.models.Instructor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InstructorRepository extends MongoRepository<Instructor, String> {
}

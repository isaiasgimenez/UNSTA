package com.example.bienestar_integral.repositories;

import com.example.bienestar_integral.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Usuario findByEmail(String email);  
}

package com.example.bienestar_integral.repositories;

import com.example.bienestar_integral.models.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReservaRepository extends MongoRepository<Reserva, String> {
    List<Reserva> findByUsuarioId(String usuarioId);  
}

package com.example.bienestar_integral.services;

import com.example.bienestar_integral.models.Reserva;
import com.example.bienestar_integral.repositories.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> obtenerReservasPorUsuarioId(String usuarioId) {
        return reservaRepository.findByUsuarioId(usuarioId);
    }

}

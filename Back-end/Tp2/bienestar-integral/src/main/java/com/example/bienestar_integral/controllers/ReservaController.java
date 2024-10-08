package com.example.bienestar_integral.controllers;

import com.example.bienestar_integral.models.Reserva;
import com.example.bienestar_integral.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.crearReserva(reserva);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Reserva> obtenerReservasPorUsuarioId(@PathVariable String usuarioId) {
        return reservaService.obtenerReservasPorUsuarioId(usuarioId);
    }
}

package com.example.bienestar_integral.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

@Document(collection = "reservas")
public class Reserva {
    @Id
    private String id; 

    @DBRef 
    private Usuario usuario;

    @DBRef
    private Actividad actividad;

    private LocalDateTime fechaReserva;

    // Constructor vacío
    public Reserva() {
    }

    // Constructor con parámetros
    public Reserva(String id, Usuario usuario, Actividad actividad, LocalDateTime fechaReserva) {
        this.id = id;
        this.usuario = usuario;
        this.actividad = actividad;
        this.fechaReserva = fechaReserva;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva; 
    }
}

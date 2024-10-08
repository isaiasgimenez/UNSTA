package com.example.bienestar_integral.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.Set;

@Document(collection = "actividades")
public class Actividad {
    @Id
    private String id; 

    private String nombre;
    private String descripcion;
    private LocalDateTime fechaHora;

    @DBRef 
    private Instructor instructor;

    @DBRef
    private Set<Reserva> reservas;

    // Constructor vacío
    public Actividad() {
    }

    // Constructor con parámetros
    public Actividad(String id, String nombre, String descripcion, LocalDateTime fechaHora, Instructor instructor, Set<Reserva> reservas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.instructor = instructor;
        this.reservas = reservas;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }
}

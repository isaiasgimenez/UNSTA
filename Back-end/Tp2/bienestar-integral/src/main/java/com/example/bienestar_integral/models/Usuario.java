package com.example.bienestar_integral.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Set;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id; 

    private String nombre;
    private String email;
    private String password;

    @DBRef 
    private Set<Reserva> reservas;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String id, String nombre, String email, String password, Set<Reserva> reservas) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }
}

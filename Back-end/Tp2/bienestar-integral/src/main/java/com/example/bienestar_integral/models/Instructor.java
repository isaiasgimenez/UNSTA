package com.example.bienestar_integral.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Set;

@Document(collection = "instructores")
public class Instructor {
    @Id
    private String id; 

    private String nombre;
    private String especialidad;

    @DBRef 
    private Set<Actividad> actividades;

    // Constructor vacío
    public Instructor() {
    }

    // Constructor con parámetros
    public Instructor(String id, String nombre, String especialidad, Set<Actividad> actividades) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.actividades = actividades;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Set<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(Set<Actividad> actividades) {
        this.actividades = actividades;
    }
}

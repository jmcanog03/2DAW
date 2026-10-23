package com.josema.plataformastreaming.model;

import java.sql.Date;
import java.time.LocalDate;

public class Usuario {
    private String nombreusuario;
    private String nombre;
    private String email;
    private String telefono;
    private LocalDate fecha;
    private String categoria;

    public Usuario(String nombreusuario, String nombre, String email, String telefono, LocalDate fecha, String categoria) {
        this.nombreusuario = nombreusuario;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombreUsuario() {
        return this.nombreusuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreusuario = nombreUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "{" +
                " nombreUsuario='" + getNombreUsuario() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", email='" + getEmail() + "'" +
                ", telefono='" + getTelefono() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", categoria='" + getCategoria() + "'" +
                "}";
    }

}

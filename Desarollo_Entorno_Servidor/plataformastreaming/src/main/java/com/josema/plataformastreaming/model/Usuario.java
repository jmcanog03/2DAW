package com.josema.plataformastreaming.model;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.josema.plataformastreaming.validation.MayorDeEdad;
import com.josema.plataformastreaming.validation.NombreUsuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Usuario {

    @NotBlank
    @NotNull
    @NombreUsuario
    private String nombreUsuario;

    @NotBlank
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+$")
    private String nombre;

    @NotBlank
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]+$")
    private String apellidos;

    @Email
    @NotBlank
    private String email;

    @Pattern(regexp = "^[0-9]{9}")
    @NotBlank
    private String telefono;

    @Past
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    @MayorDeEdad
    private LocalDate fecha;

    @NotBlank
    private String categoria;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String nombre, String apellidos, String email, String telefono,
            LocalDate fecha, String categoria) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
                ", apellidos='" + getApellidos() + "'" +
                ", email='" + getEmail() + "'" +
                ", telefono='" + getTelefono() + "'" +
                ", fecha='" + getFecha() + "'" +
                ", categoria='" + getCategoria() + "'" +
                "}";
    }

}

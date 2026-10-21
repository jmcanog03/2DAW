package com.josema.buscadorpeliculas.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Peliculas2 {
    private int id;

    @NotBlank(message = "EL titulo no puede estar vacio")
    @Size(min = 3 , max = 10, message = "No puede tener longitud menos de 3 y maximo 10")
    private String titulo;

    @NotNull(message = "Tiene que ser mayor que 0")
    
    private Integer anio;
    
    private boolean vista;


    public Peliculas2() {
    }


    public Peliculas2(int id, String titulo, Integer anio, boolean vista) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.vista = vista;
    }

   
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return this.anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public boolean isVista() {
        return this.vista;
    }

    public boolean getVista() {
        return this.vista;
    }

    

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", titulo='" + getTitulo() + "'" +
                ", anio='" + getAnio() + "'" +
                "}";
    }

}

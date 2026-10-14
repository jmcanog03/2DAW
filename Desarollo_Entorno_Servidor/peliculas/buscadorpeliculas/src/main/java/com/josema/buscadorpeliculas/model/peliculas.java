package com.josema.buscadorpeliculas.model;

public class peliculas {
    private int id;
    private String titulo;
    private Integer anio;

    public peliculas(int id, String titulo, Integer anio) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
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

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", titulo='" + getTitulo() + "'" +
                ", anio='" + getAnio() + "'" +
                "}";
    }

}

package com.josema.buscadorpeliculas.model;

public class Peliculas {
    private int id;
    private String titulo;
    private Integer anio;
    private boolean vista;

    public Peliculas(int id, String titulo, Integer anio, boolean vista) {
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

    public void setVista(boolean vista) {
        this.vista = vista;
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

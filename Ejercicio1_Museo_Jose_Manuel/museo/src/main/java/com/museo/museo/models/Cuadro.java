package com.museo.museo.models;


public class Cuadro {
    private int id;
    private String titulo;
    private int anio;
    private String estilo;
    private String descripcion;



    public Cuadro(int id, String titulo, int anio, String estilo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.estilo = estilo;
        this.descripcion = descripcion;
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

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getEstilo() {
        return this.estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", anio='" + getAnio() + "'" +
            ", estilo='" + getEstilo() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            "}";
    }

    

}

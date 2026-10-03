package com.museo.museo.models;

public class Autor {
    private int id;
    private String nombre;
    private int fechanacimiento;
    private String nacionalidad;
    private String biografia;


    public Autor(int id, String nombre, int fechanacimiento, String nacionalidad, String biografia) {
        this.id = id;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechanacimiento() {
        return this.fechanacimiento;
    }

    public void setFechanacimiento(int fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return this.biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", fechanacimiento='" + getFechanacimiento() + "'" +
            ", nacionalidad='" + getNacionalidad() + "'" +
            ", biografia='" + getBiografia() + "'" +
            "}";
    }


   
    

}

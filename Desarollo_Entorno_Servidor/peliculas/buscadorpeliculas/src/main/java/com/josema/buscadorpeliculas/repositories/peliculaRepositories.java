package com.josema.buscadorpeliculas.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.josema.buscadorpeliculas.model.peliculas;
@Repository

public class peliculaRepositories {
    
    public List<peliculas> getPeliculas(){

        return List.of(
            new peliculas(1, "Spider-Man Brand New Day", 2002)
        );

    }

    public List<peliculas> getIdPeliculas(int id){
        List<peliculas> resultado = new ArrayList<>();
        List<peliculas> pelis = getPeliculas();

        for (peliculas peliculas : pelis) {
            if(peliculas.getId() == id){
                resultado.add(peliculas);
            }
        }

        return resultado;
    }


     public List<peliculas> getAnioPeliculas(Integer anio){
        List<peliculas> resultado = new ArrayList<>();
        List<peliculas> pelis = getPeliculas();

        for (peliculas peliculas : pelis) {
            if(peliculas.getAnio().equals(anio)){
                resultado.add(peliculas);
            }
        }

        return resultado;
    }

       public List<peliculas> getTitulo(String titulo){
        List<peliculas> resultado = new ArrayList<>();
        List<peliculas> pelis = getPeliculas();

        for (peliculas peliculas : pelis) {
            if(peliculas.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                resultado.add(peliculas);
            }
        }

        return resultado;
    }

}

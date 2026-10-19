package com.josema.buscadorpeliculas.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.josema.buscadorpeliculas.model.Peliculas;
import com.josema.buscadorpeliculas.model.Peliculas2;

@Repository

public class peliculaRepositories {

    public List<Peliculas> getPeliculas() {

        return List.of(
                new Peliculas(1, "Spider-Man Brand New Day", 2002, true),
                new Peliculas(0, "Hulk", 2003, false));

    }

    
    

    public List<Peliculas> getIdPeliculas(int id) {
        List<Peliculas> resultado = new ArrayList<>();
        List<Peliculas> pelis = getPeliculas();

        for (Peliculas peliculas : pelis) {
            if (peliculas.getId() == id) {
                resultado.add(peliculas);
            }
        }

        return resultado;
    }

    public List<Peliculas> getAnioPeliculas(Integer anio) {
        List<Peliculas> resultado = new ArrayList<>();
        List<Peliculas> pelis = getPeliculas();

        for (Peliculas peliculas : pelis) {
            if (peliculas.getAnio().equals(anio)) {
                resultado.add(peliculas);
            }
        }

        return resultado;
    }

    public List<Peliculas> getTitulo(String titulo) {
        List<Peliculas> resultado = new ArrayList<>();
        List<Peliculas> pelis = getPeliculas();

        for (Peliculas peliculas : pelis) {
            if (peliculas.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultado.add(peliculas);
            }
        }

        return resultado;
    }

    public List<Peliculas> getVista() {
        List<Peliculas> resultado = new ArrayList<>();
        List<Peliculas> pelis = getPeliculas();

        for (Peliculas peliculas : pelis) {
            if (peliculas.getVista()) {
                resultado.add(peliculas);
            }
        }

        return resultado;
    }

    public List<Peliculas> getNotVista() {
        List<Peliculas> resultado = new ArrayList<>();
        List<Peliculas> pelis = getPeliculas();

        for (Peliculas peliculas : pelis) {
            if (!peliculas.getVista()) {
                resultado.add(peliculas);
            }
        }

        return resultado;
    }

   

}

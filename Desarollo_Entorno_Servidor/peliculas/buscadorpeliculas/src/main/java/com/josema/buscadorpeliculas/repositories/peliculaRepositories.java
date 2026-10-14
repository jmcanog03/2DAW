package com.josema.buscadorpeliculas.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.josema.buscadorpeliculas.model.peliculas;
@Repository

public class peliculaRepositories {
    
    public List<peliculas> getPeliculas(){

        return List.of(
            new peliculas(2, "Spider-Man Brand New Day", 2026)
        );

    }
}

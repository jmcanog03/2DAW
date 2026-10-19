package com.josema.buscadorpeliculas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.josema.buscadorpeliculas.model.Peliculas2;
import com.josema.buscadorpeliculas.repositories.peliculaRepositories;

@Controller
@RequestMapping("/ampliacion")

public class peliculaController2 {
    private peliculaRepositories peliculaRepositories;

    public peliculaController2(peliculaRepositories peliculaRepositories) {
        this.peliculaRepositories = peliculaRepositories;
        
    }

    @GetMapping("")
    public String getVista(Model model) {
        model.addAttribute("pelicula2", new Peliculas2());
        model.addAttribute("pelicula3", peliculaRepositories.getPeliculas());
        return "pelicula2";
    }

    @GetMapping("/recibir")
    @ResponseBody 
    public String getFormulario(@ModelAttribute Peliculas2 peliculas2) {
        // model.addAttribute("pelicula", peliculaRepositories.getPeliculas());
        return " id " + peliculas2.getId() + " titulo " + peliculas2.getTitulo() + " anio " + peliculas2.getAnio() + " vista " + peliculas2.getVista();
    }

}

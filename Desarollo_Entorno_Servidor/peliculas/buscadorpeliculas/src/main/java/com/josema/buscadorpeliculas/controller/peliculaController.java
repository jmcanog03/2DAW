package com.josema.buscadorpeliculas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.josema.buscadorpeliculas.repositories.peliculaRepositories;

@Controller
public class peliculaController {
    private peliculaRepositories peliculaRepositories;

    public peliculaController(peliculaRepositories peliculaRepositories) {
        this.peliculaRepositories = peliculaRepositories;
    }

    @GetMapping("/")
    public String getMethodName(Model model) {
        model.addAttribute("pelicula", peliculaRepositories.getPeliculas());
        return "pelicula";
    }

    @PostMapping("/")
    public String Peliculas(@RequestParam(required = false) String nombre,
            @RequestParam(required = false) Integer anio, @RequestParam(required = false) String titulo,
            @RequestParam(required = false) Integer id, Model model) {
        // model.addAttribute("pelicula",peliculaRepositories.getPeliculas());
        if (id != null) {
            model.addAttribute("pelicula", peliculaRepositories.getIdPeliculas(id));
        }else if(anio !=null){
            model.addAttribute("pelicula", peliculaRepositories.getAnioPeliculas(anio));
        }else if(titulo !=null && !titulo.isBlank()){
             model.addAttribute("pelicula", peliculaRepositories.getTitulo(titulo));
        }else{
             model.addAttribute("pelicula", peliculaRepositories.getPeliculas());
        }

        
        
        return "pelicula";
    }

}

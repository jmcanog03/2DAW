package com.josema.buscadorpeliculas.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josema.buscadorpeliculas.model.Peliculas2;
import com.josema.buscadorpeliculas.repositories.peliculaRepositories;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;


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

    @PostMapping("/recibir")
    public String getFormulario(@Valid  @ModelAttribute Peliculas2 pelicula2 ,BindingResult result , Model model, RedirectAttributes redirect) {
        if(result.hasErrors()){
            model.addAttribute("pelicula3", peliculaRepositories.getPeliculas());
            return "pelicula2";
        }

        // redirect.addFlashAttribute("pelicula2", peliculaRepositories.agregarPeliculas(pelicula2));

        // model.addAttribute("pelicula", peliculaRepositories.getPeliculas());
        return " id " + pelicula2.getId() + " titulo " + pelicula2.getTitulo() + " anio " + pelicula2.getAnio() + " vista " + pelicula2.getVista();
        // return "redirect/detalle";
    }


    // @GetMapping("/detalle")
    // public String getMethodName() {
    //     return "detalle";
    // }
    
    

}

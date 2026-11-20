package com.josema.prueba.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josema.prueba.entity.VideoJuego;
import com.josema.prueba.services.VideoJuegoServices;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping ("/videojuegos")
@AllArgsConstructor 
public class VideoJuegoController {
    private VideoJuegoServices videoserv;
    @GetMapping("")
    public String listadoVideoJuego(Model model) {
        model.addAttribute("mensaje", "No hay Videojuegos");
        model.addAttribute("videojuegos", videoserv.listar());
        return "listado";
    }

    @GetMapping("/{id}")
    public String getMethodName( @PathVariable("id")long id,Model model ) {
        Optional<VideoJuego> videojuego = videoserv.buscarPorId(id);
        
        if(videojuego.isPresent()){
            model.addAttribute("videojuegoid",videojuego.get());
        }else{
            return "redirect:/videojuegos";
        }
        
        return "detalle";
    }

    @GetMapping("/nuevo")
    public String getFormulario(Model model) {
        model.addAttribute("videojuegoform",  new VideoJuego());
        return "formulario";
    }

    @PostMapping("")
    public String postFormulario(@Valid @ModelAttribute("videojuegoform") VideoJuego v, BindingResult result) {
        
        if(result.hasErrors()){
            return "formulario";
        }

        videoserv.guardar(v);
        
        return "redirect:/videojuegos";
    }

    @PostMapping("/{id}/eliminar")
    public String postEliminar(@PathVariable ("id") Long id) {
        videoserv.eliminar(id);
        return "redirect:/videojuegos";
    }

    @GetMapping("/buscar")
    public String getVideoJuegoTitulo(@RequestParam String titulo,Model model) {
        model.addAttribute("videojuegos", videoserv.buscarPorTitulo(titulo));
        return "busqueda";
    }
    
    @GetMapping("/plataforma/{plataforma}")
    public String getVideoJuegosPlataforma(@PathVariable ("plataforma") String plataforma,Model model) {
        model.addAttribute("videojuegos", videoserv.buscarPorPlataforma(plataforma));
        return "busqueda";
    }

    @GetMapping("/recientes")
    public String getRecientes(@RequestParam Integer anio,Model model) {
        model.addAttribute("videojuegos", videoserv.recientes(anio));
        return "busqueda";
    }
    
    
    
    
    
    
    
}

package com.josema.ninjas.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.josema.ninjas.entities.Ninja;
import com.josema.ninjas.services.NinjaServices;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class NinjaController {

    NinjaServices ninjaservices;

    @GetMapping("")
    public String getNinjas(Model model) {
        Ninja ninja = new Ninja();
        model.addAttribute("ninja",ninja);
        model.addAttribute("ninjas", ninjaservices.getNinjas());
        return "ninja";
    }

    @GetMapping("busqueda")
    public String getNinjaID( Model model) {
        model.addAttribute("ninja", new Ninja());
        return "busqueda";
    }

    @GetMapping("mostrar")
    public String mostrarNinjaID(@ModelAttribute Ninja ninja,Model model) {
        Optional<Ninja> resultado = ninjaservices.getNinjasID(ninja.getId());

        if(resultado.isPresent()){
            model.addAttribute("ninja", resultado.get());
        }else{
            model.addAttribute("ninja", new Ninja());
            model.addAttribute("mensaje", "no se ha encontrado el ninja");
        }

        // resultado.ifPresent((ninja1)->{

        // });

        // resultado.ifPresentOrElse((ninja1)->{

        // },()->{

        // });
        
        return "mostrar";
    }
    
    
}

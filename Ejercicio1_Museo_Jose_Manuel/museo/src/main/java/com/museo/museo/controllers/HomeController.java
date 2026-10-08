package com.museo.museo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.museo.museo.services.AutorServices;
import com.museo.museo.services.CuadroServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class HomeController {
    
    private CuadroServices cuadroServices;
    private AutorServices autorServices;


    public HomeController(CuadroServices cuadroServices, AutorServices autorServices) {
        this.cuadroServices = cuadroServices;
        this.autorServices = autorServices;
    }


    @GetMapping("")
    public String listfragmento(Model model) {
        return "fragmento";
    }

    @GetMapping("/raiz")
    public String list3autorescuadros2(Model model) {
        model.addAttribute("autores", autorServices.get3Autores());
        model.addAttribute("cuadros", cuadroServices.get3Cuadros());
        return "raiz";
    }
    
}

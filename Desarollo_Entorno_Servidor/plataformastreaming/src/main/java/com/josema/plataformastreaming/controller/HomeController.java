package com.josema.plataformastreaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.josema.plataformastreaming.repositories.usuarioRepositories;
import com.josema.plataformastreaming.services.usuarioServices;


@Controller 
@RequestMapping("/principal")
public class HomeController {

    private usuarioServices usuarioservices;


    public HomeController(usuarioServices usuarioservices) {
        this.usuarioservices = usuarioservices;
    }

    @GetMapping("")
    public String getUsurio(Model model) {
        model.addAttribute("usuario", usuarioservices.getUusarios());
        return "raiz";
    }
    
}

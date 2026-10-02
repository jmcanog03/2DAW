package com.museo.museo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.museo.museo.services.Autorservices;


@Controller
@RequestMapping("/autor")
public class Autorcontroller {
    private Autorservices autorservices;

    public Autorcontroller(Autorservices autorservices){
        this.autorservices = autorservices;
    }

    @GetMapping("")
    public String listAutores(Model model) {
        model.addAttribute("autores",autorservices.getAutores());
        return "autor";
    }
    


}

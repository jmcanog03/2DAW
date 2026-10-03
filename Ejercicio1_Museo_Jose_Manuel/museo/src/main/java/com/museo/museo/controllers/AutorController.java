package com.museo.museo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.museo.museo.services.AutorServices;


@Controller
@RequestMapping("/autor")
public class AutorController {
    private AutorServices autorservices;

    public AutorController(AutorServices autorservices){
        this.autorservices = autorservices;
    }

    @GetMapping("")
    public String listAutores(Model model) {
        model.addAttribute("autores",autorservices.getAutores());
        return "autor";
    }


    @GetMapping("/{userID}")
    public String getDevolverAutorID(@PathVariable int userID, Model model) {
        model.addAttribute("autorID", autorservices.getAutorByID(userID));
        return "autorid";
    }
    
    


}

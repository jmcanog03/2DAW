package com.museo.museo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.museo.museo.services.CuadroServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cuadro")
public class CuadroController {
    private CuadroServices cuadroServices;

    public CuadroController(CuadroServices cuadroServices) {
        this.cuadroServices = cuadroServices;
    }

    @GetMapping("")
    public String listCuadros(@RequestParam(required = false) String estilo,
            @RequestParam(required = false) Integer aniomin, @RequestParam(required = false) Integer aniomax,
            Model model) {
        // model.addAttribute("cuadros", cuadroServices.getCuadros());
        // return "cuadro";

        if (estilo != null) {
            model.addAttribute("cuadros", cuadroServices.getCuadroByEstilo(estilo));

        } else if (aniomin != null && aniomax != null) {
            model.addAttribute("cuadros", cuadroServices.getCuadroByAnio(aniomin, aniomax));
        } else {
            model.addAttribute("cuadros", cuadroServices.getCuadros());
        }

        return "cuadro";

    }

    @GetMapping("/{userID}")
    public String getDevolverAutorID(@PathVariable int userID, Model model) {
        model.addAttribute("cuadroID", cuadroServices.getCuadroByID(userID));
        return "cuadroid";
    }

}

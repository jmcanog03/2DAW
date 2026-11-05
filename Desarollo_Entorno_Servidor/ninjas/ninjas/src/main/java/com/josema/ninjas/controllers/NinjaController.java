package com.josema.ninjas.controllers;

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
    public String getNinjas(Ninja ninja, Model model) {
        model.addAttribute("ninjas", ninjaservices.getNinjas());
        return "ninja";
    }
    
    
    
}


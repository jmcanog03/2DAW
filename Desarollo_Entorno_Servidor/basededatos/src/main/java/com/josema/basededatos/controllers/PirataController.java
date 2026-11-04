package com.josema.basededatos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.josema.basededatos.entities.Pirata;
import com.josema.basededatos.repositories.pirataRepositories;

import lombok.AllArgsConstructor;


@Controller 
@RequestMapping("/")
@AllArgsConstructor 
public class PirataController {

    pirataRepositories piratarepositories ;

    @GetMapping("")
    @ResponseBody
    public String getMethodName() {
        piratarepositories.save(Pirata.builder().nombre("Bobolon").recompensa(200).build());
        
        return piratarepositories.findAll().toString();
    }
    
}

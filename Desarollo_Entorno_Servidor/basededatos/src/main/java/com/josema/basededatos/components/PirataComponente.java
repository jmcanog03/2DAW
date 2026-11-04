package com.josema.basededatos.components;

import org.springframework.stereotype.Component;

import com.josema.basededatos.services.PirataServices;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Component 
@AllArgsConstructor 
public class PirataComponente {
    PirataServices pirataservices;

    @PostConstruct
    public void guardar(){
        
    }
}

package com.josema.ninjas.components;

import org.springframework.stereotype.Component;

import com.josema.ninjas.entities.Ninja;
import com.josema.ninjas.services.NinjaServices;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor 
public class NinjaComponents {
    
    NinjaServices ninjaservices;

    @PostConstruct 
    public void agregarNinjasComponent(){
        
        Ninja ninja = Ninja.builder().nombre("josema").clan("clan del pie").rango("bajo").aldea("paldea").build();
        
        ninjaservices.agregarNinjas(ninja);
    }
}

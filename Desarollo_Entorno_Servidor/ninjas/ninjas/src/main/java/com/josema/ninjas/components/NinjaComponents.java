package com.josema.ninjas.components;

import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.josema.ninjas.entities.Clase;
import com.josema.ninjas.entities.Ninja;
import com.josema.ninjas.repositories.NinjaRepositories;
import com.josema.ninjas.services.NinjaServices;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class NinjaComponents {

    NinjaServices ninjaservices; 
    @PostConstruct
    public void agregarNinjasComponent() {

        // ninjaservices.borrarTodo();
        
        Ninja ninja = Ninja.builder().nombre("josema").clan("clan del alumno").aldea("paldea").clase(Clase.ALUMNO).build();
        Ninja ninja2 = Ninja.builder().nombre("bobolon").clan("clan del profe").aldea("paldea").clase(Clase.ALUMNO)
                .build();

         Ninja ninja3 = Ninja.builder().nombre("Fabricio").clan("clan del alumno").aldea("paldea").clase(Clase.ALUMNO)
                .build();

        ninjaservices.agregarNinjas(ninja);
        ninjaservices.agregarNinjas(ninja2);
        ninjaservices.agregarNinjas(ninja3);

    }
}

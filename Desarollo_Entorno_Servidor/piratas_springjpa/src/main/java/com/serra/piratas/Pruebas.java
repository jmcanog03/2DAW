package com.serra.piratas;

import org.springframework.stereotype.Component;

import com.serra.piratas.repositories.PirataRepository;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor 
public class Pruebas {
    PirataRepository pirataRepository;
    
    @PostConstruct
    public void pruebasRepo(){
        System.out.println("===========PRUEBAS===========");

        // pirataRepository.findByTripulacion("Piratas de Buggy").forEach(pirata-> System.out.println(pirata));
        pirataRepository.findByTripulacion("Piratas de Buggy").forEach(System.out::println);

        pirataRepository.findByRecompensaGreaterThan(315000000L).forEach(System.out::println);

        pirataRepository.findByNombreContainingIgnoreCase("Chopper").forEach(pirata -> System.out.println(pirata));

        pirataRepository.findByFrutaDelDiabloIsNull().forEach(pirata -> System.out.println(pirata));



        
    }
}

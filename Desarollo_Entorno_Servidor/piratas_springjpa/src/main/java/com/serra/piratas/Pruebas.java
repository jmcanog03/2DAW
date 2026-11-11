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
    public void pruebasRepo() {
        System.out.println("===========PRUEBAS===========");

        // pirataRepository.findByTripulacion("Piratas de Buggy").forEach(pirata->
        // System.out.println(pirata));
        pirataRepository.findByTripulacion("Piratas de Buggy").forEach(System.out::println);

        pirataRepository.findByRecompensaGreaterThan(315000000L).forEach(System.out::println);
        pirataRepository.findByRecompensaLessThan(16000000L).forEach(System.out::println);

        pirataRepository.findByNombreContainingIgnoreCase("Chopper").forEach(pirata -> System.out.println(pirata));

        pirataRepository.findByFrutaDelDiabloIsNull().forEach(pirata -> System.out.println(pirata));

        pirataRepository.findByRecompensaBetween(16000000L, 120000000L).forEach(pirata -> System.out.println(pirata));

        pirataRepository.findByTripulacionAndRecompensaGreaterThan("Piratas del Sombrero de Paja", 50L)
                .forEach(System.out::println);

        pirataRepository.findByNombreStartingWith("N") .forEach(System.out::println);

        pirataRepository.findByTripulacionOrFrutaDelDiablo("Piratas de Buggy", "Gomu Gomu no Mi").forEach(System.out::println);

        pirataRepository.findTop3ByOrderByRecompensaDesc().forEach(System.out::println);

        pirataRepository.findByFrutaDelDiabloAndRecompensaGreaterThan("Gomu Gomu no Mi", 1000000L).forEach(System.out::println);

        System.out.println(pirataRepository.existsByNombreContaining("Luffy"));

        System.out.println(pirataRepository.countByTripulacion("Piratas de Buggy"));

        pirataRepository.findTop5ByTripulacionOrderByRecompensaAsc("Piratas del Sombrero de Paja").forEach(System.out::println);

        // pirataRepository.findByRecompensaBetween(100000L, 100000000L).forEach(System.out::println);

        pirataRepository.findTop3ByFrutaDelDiabloIsNullOrderByRecompensaAsc().forEach(System.out::println);

        pirataRepository.findByTripulacionAndRecompensaGreaterThanOrderByRecompensaDesc("Piratas de Buggy", 1000L).forEach(System.out::println);

        pirataRepository.findByRecompensaGreaterThanAndTripulacionNotAndNombreEndingWith(1000000L, "Piratas de Buggy", "y").forEach(System.out::println);












    }
}

package com.serra.piratas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serra.piratas.entities.Pirata;

public interface PirataRepository extends JpaRepository<Pirata, Long> {
    List<Pirata> findByTripulacion(String tripulacion);

    List<Pirata> findByRecompensaGreaterThan(Long recompensa);

    List<Pirata> findByNombreContainingIgnoreCase(String palabra);

    List<Pirata> findByFrutaDelDiabloIsNull();

    List<Pirata> findByRecompensaBetween(Long min, Long max);
    
    List<Pirata> findByTripulacionAndRecompensaGreaterThan(String tripulacion,Long recompensa);

    

}
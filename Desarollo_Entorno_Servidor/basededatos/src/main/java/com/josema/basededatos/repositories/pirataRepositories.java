package com.josema.basededatos.repositories;

import java.util.List;
import java.util.Optional;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josema.basededatos.entities.Pirata;

public interface pirataRepositories extends JpaRepository<Pirata,Long>{

    List<Pirata> findByNombre(String nombre);

    List<Pirata> findByRecompensa(int recompensa);

    List<Pirata> findBYNombreEndinWith(String cadena);

    List<Pirata> findByDescripcionNotContaining(String palabra);

    List<Pirata> findByDescripcionNotLike(String palabra);

    List<Pirata> findByFrutaDelDiabloNot(String fruta);

    List<Pirata> findByRecompensaNot(Long recompensa);

    List<Pirata> findByNombreAndTripulacionOrderByNombreDesc(String nombre, String tripulacion);

     List<Pirata> findFirst2ByTripulacionOrderByNombreAsc(String tripulacion);

     Optional<Pirata> findByNombreIgnoreCase(String nombre);

     Long countByRecompensaGreaterThanEqual(Long recompensa);

     Boolean existsexistsByFrutaDelDiablo(String frutaDelDiablo);

     



    
} 

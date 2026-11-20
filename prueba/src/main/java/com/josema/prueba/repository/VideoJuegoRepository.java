package com.josema.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.josema.prueba.entity.VideoJuego;



public interface VideoJuegoRepository extends JpaRepository<VideoJuego,Long>{
    
    List<VideoJuego> findByPlataformaIgnoreCase(String p);
    
    List<VideoJuego> findByTituloContainingIgnoreCaseOrderByPrecioDesc(String p);

    @Query("""
        
        SELECT v From VideoJuego v
        WHERE v.anioLanzamiento > ?1
    
    
    """)

    List<VideoJuego> VideoJuegosMayorQue(int anio);


}

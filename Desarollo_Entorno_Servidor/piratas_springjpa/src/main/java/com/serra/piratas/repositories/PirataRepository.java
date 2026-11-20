package com.serra.piratas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.serra.piratas.entities.Pirata;

public interface PirataRepository extends JpaRepository<Pirata, Long> {
        List<Pirata> findByTripulacion(String tripulacion);

        List<Pirata> findByRecompensaGreaterThan(Long recompensa);

        List<Pirata> findByNombreContainingIgnoreCase(String palabra);

        List<Pirata> findByFrutaDelDiabloIsNull();

        List<Pirata> findByRecompensaBetween(Long min, Long max);

        List<Pirata> findByTripulacionAndRecompensaGreaterThan(String tripulacion, Long recompensa);

        List<Pirata> findByNombreStartingWith(String nombre);

        List<Pirata> findByTripulacionOrFrutaDelDiablo(String tripulacion, String frutaDelDiablo);

        List<Pirata> findByRecompensaOrderByRecompensaDesc(Long recompensa);

        List<Pirata> findTop3ByOrderByRecompensaDesc();

        List<Pirata> findByDescripcionStartingWithAndRecompensaLessThan(String palabra, Long recompensa);

        List<Pirata> findByFrutaDelDiabloAndRecompensaGreaterThan(String fruta, Long recompensa);

        Boolean existsByNombreContaining(String nombre);

        Long countByTripulacion(String tripulacion);

        List<Pirata> findTop5ByTripulacionOrderByRecompensaAsc(String tripulacion);

        // List<Pirata> findByRecompensaNotBetween(Long min, Long max);

        List<Pirata> findByRecompensaLessThan(Long Min);

        List<Pirata> findByNombreContainingIgnoreCaseAndTripulacionAndRecompensaGreaterThan(String nombre,
                        String tripulacion, Long recompensa);

        List<Pirata> findTop3ByFrutaDelDiabloIsNullOrderByRecompensaAsc();

        List<Pirata> findByTripulacionAndRecompensaGreaterThanOrderByRecompensaDesc(String tripulacion,
                        Long recompensa);

        // @Query("Select p From Pirata p Where (p.tripulacion = :tripulacion1 OR
        // p.tripulacion = :tripulacion2) AND p.recompensa > :recompensa ORDER BY
        // p.recompensa DESC")
        // List<Pirata> buscarPorTripulacionYRecompensa(@Param("tripulacion1") String
        // tripulacion1,@Param("tripulacion2") String tripulacion2,@Param("recompensa")
        // Long recompensa);

        List<Pirata> findByRecompensaGreaterThanAndTripulacionNotAndNombreEndingWith(Long recompensa,
                        String tripulacion,
                        String cadena);

        @Query("SELECT pirata FROM Pirata pirata WHERE pirata.recompensa >= :recompensaMin")
        List<Pirata> buscarPorRecompensaMayorQue(@Param("recompensaMin") Long recompensaMin);

        @Query("SELECT p FROM Pirata p WHERE p.tripulacion = ?1 AND p.recompensa >= ?2")
        List<Pirata> buscarPorTripulacionYRecompensa(String tripulacion , Long recompensa);

        @Query("""
                SELECT p FROM Pirata p
                WHERE LOWER(p.nombre) LIKE CONCAT('%', LOWER(?1),'%')
                OR LOWER(p.descripcion) LIKE CONCAT('%', LOWER(?1),'%')  
        """)
        List<Pirata> buscarPorTexto(String texto);


        @Query("""
                SELECT p FROM Pirata p
                WHERE p.tripulacion IN ?1 
                ORDER BY p.nombre DESC
        """)

        List<Pirata> buscarPorAlgunaTripulacion(List<String> tripulaciones);

        @Query("""
                SELECT DISTINCT p.tripulacion FROM Pirata p
        """)
        List<String> buscarTripulaciones();

        @Query("""
                SELECT SUM(COALESCE(p.recompensa, OL)) FROM Pirata p       
        """)

        Long totalRecompensa();

        

        



}
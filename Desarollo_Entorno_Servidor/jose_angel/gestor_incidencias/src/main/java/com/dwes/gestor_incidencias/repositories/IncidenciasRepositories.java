package com.dwes.gestor_incidencias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwes.gestor_incidencias.entities.Incidencia;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Repository 

public interface IncidenciasRepositories extends JpaRepository <Incidencia,Long> {
    
}

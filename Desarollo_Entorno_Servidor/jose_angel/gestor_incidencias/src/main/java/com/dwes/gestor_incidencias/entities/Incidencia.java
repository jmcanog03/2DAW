package com.dwes.gestor_incidencias.entities;

import java.sql.Date;
import java.time.LocalDate;

import com.dwes.gestor_incidencias.Enum.Prioridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity 
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "incidencias")
public class Incidencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String titulo;

    
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private Prioridad Prioridad;

    private String estado;

    private LocalDate fecha_registro;

}

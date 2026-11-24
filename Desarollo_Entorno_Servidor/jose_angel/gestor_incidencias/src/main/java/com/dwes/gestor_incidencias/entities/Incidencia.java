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
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder.Default;

@Entity 
@AllArgsConstructor
@NoArgsConstructor
@Builder 
@Data 
public class Incidencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "No puede estar vacio")
    private String titulo;

    @NotBlank (message = "No puede estar vacio")
    private String descripcion;

    @NotNull (message = "No puede estar vacio")
    @Enumerated(EnumType.STRING)
    private Prioridad prioridad;
    
    @Builder.Default
    private String estado = "ABIERTA";

    @Builder.Default
    @FutureOrPresent (message = "La fecha tiene que ser de hoy o posteriora la de hoy")
    private LocalDate fecha_registro = LocalDate.now();

}

package com.serra.piratas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class Pirata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 60, message = "El nombre debe tener entre 2 y 60 caracteres")
    @Column(nullable = false, length = 60)
    private String nombre;

    @NotBlank(message = "La tripulación es obligatoria")
    @Size(max = 60, message = "Máximo 60 caracteres")
    @Column(nullable = false, length = 60)
    private String tripulacion;

    @Size(max = 80, message = "Máximo 80 caracteres")
    @Column(length = 80)
    private String frutaDelDiablo;

    @NotNull(message = "La recompensa es obligatoria")
    @PositiveOrZero(message = "La recompensa no puede ser negativa")
    @Column(nullable = false)
    private Long recompensa;

    @Size(max = 500, message = "Máximo 500 caracteres")
    @Column(length = 500)
    private String descripcion;
}
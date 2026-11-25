package com.josema.proyectojuegodecartas.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ExcludeDefaultListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "criatura")
public class Criaturas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String codigo;

    @NotBlank
    @Column(unique = true)
    private String nombre;

    @Min(value = 1)
    @Max(value = 10)
    @NotNull
    private Integer ataque;

    @Min(value = 1)
    @Max(value = 10)
    @NotNull
    private Integer defensa;

    private String imagen;

    @ManyToMany (mappedBy = "criaturas")
    
    private List<Mazos> mazos;
    
    @Enumerated (EnumType.STRING)
    private  Elementos elemento;


    public Integer getCoste() {

        Integer ataque = getAtaque();
        Integer defensa = getDefensa();

        if (ataque != null && defensa != null) {
            return ataque + defensa;
        }

        return null;
    }




}

package com.josema.proyectojuegodecartas.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table (name = "mazo")
public class Mazos {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String tipo;

    private Boolean esDefinido;

    @ManyToMany 
    @JoinTable (
        name = "mazo_criatura",
        joinColumns = @JoinColumn(name = "mazo_id"),
        inverseJoinColumns = @JoinColumn (name = "criatura_id")
    )
    private List<Criaturas> criaturas;
}

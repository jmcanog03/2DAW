package com.josema.basededatos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
// @AllArgsConstructor 
// @ToString 
// @EqualsAndHashCode
// @
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pirata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String nombre;
    
    int recompensa;
}

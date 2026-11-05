package com.josema.ninjas.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String nombre;

    String clan;

    String rango;

    String aldea;
}

package com.josema.ninjas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ninja")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "name")
    String nombre;

    @Column(name = "ninjaclan")
    String clan;

    // @Column(name = "range")
    // String rango;

    @Column(name = "ninjaaldea")
    String aldea;

    @Enumerated(EnumType.STRING)
    Clase clase;

    // @Transient 
    // String cualquiercosa;



}

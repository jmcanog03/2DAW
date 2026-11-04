package com.josema.basededatos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.josema.basededatos.entities.Pirata;
import com.josema.basededatos.repositories.pirataRepositories;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor 
public class PirataServices {
    pirataRepositories piratarepositories;

    public List<Pirata> getPirata(){
        List <Pirata> lista = piratarepositories.findAll();
        return lista;
    }
}

package com.josema.ninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.josema.ninjas.entities.Ninja;
import com.josema.ninjas.repositories.NinjaRepositories;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NinjaServices {
    NinjaRepositories ninjasrepositories;

    public List<Ninja> getNinjas() {
        List<Ninja> lista = ninjasrepositories.findAll();
        return lista;
    }

    public Optional<Ninja> getNinjasID(Long id) {
        Optional<Ninja> ninja = ninjasrepositories.findById(id);
        return ninja;
    }

    public void agregarNinjas(Ninja ninja) {

        ninjasrepositories.save(ninja);

    }

    public void borrarTodo(){
        ninjasrepositories.deleteAll();
    }

    
}

package com.museo.museo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.museo.museo.models.Autor;
import com.museo.museo.repositories.AutorRepositories;

@Service 
public class AutorServices {

    private AutorRepositories autorrepositories;
    public AutorServices(AutorRepositories autorrepositories){
        this.autorrepositories = autorrepositories;
    }

    
    // public Usuarios getUsuarioByID(int id) {
    //     List<Usuarios> lista = List.of(
    //             new Usuarios("12", "josema"),
    //             new Usuarios("16", "emilio"));

    //     return lista.get(id);
    // }

    public List<Autor> getAutores(){
        return autorrepositories.lista();
    }

    public Autor getAutorByID(int id){
        List <Autor> autores = autorrepositories.lista();

        for (Autor autor : autores) {
            if(autor.getId() == id){
                return autor;
            }
        }

        return null;
    }

    public List <Autor> get3Autores(){
        return autorrepositories.lista().subList(0, 3);
    }




    
   
}

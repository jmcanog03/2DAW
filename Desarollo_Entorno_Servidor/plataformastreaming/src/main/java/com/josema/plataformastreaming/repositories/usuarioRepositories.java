package com.josema.plataformastreaming.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.josema.plataformastreaming.model.Usuario;

@Repository 
public class usuarioRepositories {
    
    List<Usuario> listaUsuarios = new ArrayList<>();


    public List<Usuario> getUsuarios(){
        return listaUsuarios;
    }

    public List<Usuario> anadirUsuarios(Usuario usuario){
        listaUsuarios.add(usuario);
        return listaUsuarios;
    }

    public boolean registro(Usuario usuario){
        boolean esta = false;

        for (int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.contains(usuario)){
                esta = true;
            }else{
                esta = false;
            }
        }

        return esta;
    }

    public boolean inicioSesion(Usuario usuario){
        boolean esta = false;
        for (Usuario usuario2 : listaUsuarios) {
            if(usuario2.getNombreUsuario().equalsIgnoreCase(usuario.getNombreUsuario())){
                esta = true;
            }else{
                esta = false;
            }
        }

        return esta;
    }
}

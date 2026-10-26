package com.josema.plataformastreaming.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.josema.plataformastreaming.model.Usuario;
import com.josema.plataformastreaming.repositories.usuarioRepositories;

@Service
public class usuarioServices {

    private usuarioRepositories usuariorepositories;

    public usuarioServices(usuarioRepositories usuariorepositories) {
        this.usuariorepositories = usuariorepositories;
    }

    public boolean comprobarRegistro(Usuario usuario) {
        boolean estaBien = false;
        if (!usuariorepositories.registro(usuario)) {
            estaBien = false;
        } else {
            estaBien = true;
            usuariorepositories.anadirUsuarios(usuario);
        }

        return estaBien;
    }

    public List<Usuario> getUusarios() {
        return usuariorepositories.getUsuarios();
    }

    public Boolean validarInicioSesion(Usuario usuario2) {
        boolean esta = false;
        if (!usuariorepositories.inicioSesion(usuario2)) {
            return esta = false;
        }

        return esta = true;
    }

    public Usuario BusquedaUsuario(Usuario usuario){
       for (Usuario usuario2: usuariorepositories.getUsuarios()) {
            if(usuario2.getNombreUsuario().equalsIgnoreCase(usuario.getNombreUsuario())){
                return usuario2;
            }
       }


        return null;
    }

}

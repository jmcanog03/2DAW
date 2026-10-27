package com.josema.plataformastreaming.validation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import com.josema.plataformastreaming.model.Usuario;
import com.josema.plataformastreaming.services.usuarioServices;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class NombreUsuarioValidator implements ConstraintValidator<NombreUsuario, String> {

    private usuarioServices usuarioservices;

    public NombreUsuarioValidator(usuarioServices usuarioservices) {
        this.usuarioservices = usuarioservices;
    }

    @Override
    public boolean isValid(String nombreUsuario, ConstraintValidatorContext context) {
        boolean esta = true;
        if (nombreUsuario == null) {
            return true;
        }

        List<Usuario> lista = usuarioservices.getUusarios();

        for (int i = 0; i < lista.size(); i++) {
            Usuario usuario = lista.get(i);
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                esta = false;
            }
        }



        return esta;
    }
}

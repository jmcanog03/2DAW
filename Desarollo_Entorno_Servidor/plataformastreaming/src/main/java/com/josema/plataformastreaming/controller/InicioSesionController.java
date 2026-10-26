package com.josema.plataformastreaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.josema.plataformastreaming.model.Usuario;
import com.josema.plataformastreaming.services.usuarioServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("inicio")
public class InicioSesionController {
    private usuarioServices usuarioservices;

    public InicioSesionController(usuarioServices usuarioservices) {

        this.usuarioservices = usuarioservices;
    }

    @GetMapping("")
    public String getMethodName(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "inicio";
    }

    @GetMapping("/busqueda")
    public String getUsuario(Model model, @ModelAttribute("usuario") Usuario usuario) {

        if (usuarioservices.validarInicioSesion(usuario)) {
            Usuario encontrado = usuarioservices.BusquedaUsuario(usuario);

            if (encontrado != null) {
                model.addAttribute("usuario", encontrado);

                return "busqueda";
            }

        }

        return "inicio";

    }

}

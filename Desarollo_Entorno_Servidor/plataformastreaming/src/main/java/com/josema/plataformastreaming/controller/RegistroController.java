package com.josema.plataformastreaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.josema.plataformastreaming.model.Usuario;
import com.josema.plataformastreaming.services.usuarioServices;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
@RequestMapping("/registro")
public class RegistroController {
    private usuarioServices usuarioservices;

    public RegistroController(usuarioServices usuarioservices) {
        this.usuarioservices = usuarioservices;
    }

    @GetMapping("")
    public String getUsuario(Model model) {
        model.addAttribute("usaurio", usuarioservices.getUusarios());
        return "registro";
    }


    @PostMapping("")
    public String postMethodName(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result,RedirectAttributes redirec,Model model) {
        
        if(result.hasErrors()){
            return "registro";
        }
        
        if(!usuarioservices.comprobarRegistro(usuario)){
            return "registro";
        }

        return "redirect:/inicio";
        
        
    }
    
    
}

package com.dwes.gestor_incidencias.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.dwes.gestor_incidencias.entities.Incidencia;
import com.dwes.gestor_incidencias.repositories.IncidenciasRepositories;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@AllArgsConstructor 
@RequestMapping ("incidencias")
public class IncidenciaController {
    private IncidenciasRepositories incidenciasrepo;
    @GetMapping("")
    public String getIncidencias(Model model) {
        model.addAttribute("incidencias", incidenciasrepo.findAll());
        return "incidencias";
    }

    @GetMapping("/nuevo")
    public String getFormulario(Model model) {
        model.addAttribute("incidencia", new Incidencia());
        return "nueva-incidencia";
    }
    
    @PostMapping("/nuevo")
    public String postFormulario(@Valid Incidencia incidencia ,BindingResult result ,Model model) {
        
        if(result.hasErrors()){
            return "nueva-incidencia";
        }
        model.addAttribute("incidencia", incidenciasrepo.save(incidencia));
        
        return "redirect:/incidencias";
    }

    @GetMapping("/{id}")
    public String getIncidenciaID(@PathVariable("id") Long id,Model model) {
        Optional<Incidencia> incidenciaID = incidenciasrepo.findById(id);

        if(incidenciaID.isPresent()){
            model.addAttribute("incidencia", incidenciaID.get());
        }else{
            return "redirect:/incidencias";
        }
        return "incidenciaid";
    }

    @GetMapping("/eliminar/{id}")
    public String getDeleteIncidencia(@PathVariable ("id") Long id,Model model) {
        
        if(incidenciasrepo.existsById(id)){
            incidenciasrepo.deleteById(id);
        }

        return "redirect:/incidencias";
    }
    

    
    

    
}

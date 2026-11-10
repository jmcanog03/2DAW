package com.serra.piratas.controllers;

import com.serra.piratas.entities.Pirata;
import com.serra.piratas.repositories.PirataRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/piratas")
@AllArgsConstructor 
public class PirataController {

    private final PirataRepository repo;

    @GetMapping
    public String listar(@RequestParam(required = false) String nombre,
                         @RequestParam(required = false) String tripulacion,
                         @RequestParam(required = false) Long recompensaMin,
                         Model model) {

        List<Pirata> todos = repo.findAll();

        model.addAttribute("piratas", todos);
        model.addAttribute("tripulaciones",
                todos.stream().map(Pirata::getTripulacion).distinct().sorted().toList());
        model.addAttribute("nombre", nombre);
        model.addAttribute("tripulacion", tripulacion);
        model.addAttribute("recompensaMin", recompensaMin);
        return "piratas/lista";
    }

    @GetMapping("/{id}")
    public String detalle(@PathVariable Long id, Model model) {
        Pirata pirata = repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pirata no encontrado"));
        model.addAttribute("pirata", pirata);
        return "piratas/detalle";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("pirata", new Pirata());
        return "piratas/formulario";
    }

    @PostMapping
    public String guardar(@Valid @ModelAttribute("pirata") Pirata pirata,
                          BindingResult result,
                          RedirectAttributes flash) {
        if (result.hasErrors()) {
            return "piratas/formulario";
        }
        repo.save(pirata);
        flash.addFlashAttribute("mensaje", "¡" + pirata.getNombre() + " se ha hecho a la mar!");
        return "redirect:/piratas";
    }
}
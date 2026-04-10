package com.juanboj.primeraPagina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatosController {

    @GetMapping("/datos")
    public String mostrarDatos(Model model){
        model.addAttribute("Nombre", "Juan Pablo Ricardo");
        model.addAttribute("Apellido", "Boj Tunche");
        model.addAttribute("Edad", 17);
    return "datos";
    }
}
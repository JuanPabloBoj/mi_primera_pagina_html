package com.juanboj.primeraPagina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class PerfilController {

    @GetMapping("/perfil")
    public String mostrarPerfil(Model model){
        model.addAttribute("Nombre", "Juan Pablo Ricardo");
        model.addAttribute("Apellido", "Boj Tunche");
        model.addAttribute("Edad", 17);

        List<String> habilidades = Arrays.asList("Dedicacion cuando me gusta algo", "Detallista en proyectos grandes", "Correr rapido", "Bueno en los videojuegos", "Metabolismo rapido");
        model.addAttribute("Habilidades", habilidades);

        List<String> descripcion = Arrays.asList("Moreno", "Mediana estatura", "uso lentes", "siempre con frio", "serio y relajado", "algo fuerte");
        model.addAttribute("Descripcion", descripcion);
        return"perfil";
    }
}

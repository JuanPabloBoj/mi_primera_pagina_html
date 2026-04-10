package com.juanboj.primeraPagina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UsuarioController {

    @GetMapping("/usuario")
    public String mostrarUsuario(Model model){
        model.addAttribute("Nombre","Juan Boj");
        model.addAttribute("Edad",17);

        List<String> habilidades = Arrays.asList("Java", "MySQL", "Spring Boot", "Htmal", "CSS", "JS");
        model.addAttribute("Habilidades", habilidades);
        return "usuario";
    }
}

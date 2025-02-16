package com.mike.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/", "/home"})
    public String home(){
        return "redirect:/list"; //refresca la pagina cambia el request
        // return "forward:/list"; //No refresca el request, mantiene la misma ruta
    }

}

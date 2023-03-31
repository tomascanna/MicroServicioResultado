package com.example.resultados.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultadoController {
    @GetMapping("/resultado/{numero}")
     public String mostrarResultado(@PathVariable Float numero){
        return "El resultado es: "+numero;
     }
}

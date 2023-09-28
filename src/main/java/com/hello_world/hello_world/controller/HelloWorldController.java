package com.hello_world.hello_world.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    @RequestMapping("/")
    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }

    @RequestMapping("/bsm-generation")
    @GetMapping
    public String bsmGeneration() {
        return "Persistência\nMentadilade de crescimento\nOrientação ao futuro\nResponsabilida pessoal\nTrabalho em equipe\nComunicação\nOrientação aos detalhes\nProatividade";
    }

    @RequestMapping("/objetivos")
    @GetMapping
    public String objetivos(){
        return "Objetivo semanal:\n" +
                " - Comunicação\n" +
                " - Spring Boot" ;
    }
}

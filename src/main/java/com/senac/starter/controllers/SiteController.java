package com.senac.starter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SiteController {

    @GetMapping("/")
    public String home(){

        return "home";
    }

    @GetMapping("/jogos")
    public String jogos(){
        return "jogos";
    }

    @GetMapping("/filmes")
    public String filmes(){

        return "filmes";
    }

    @GetMapping("/posts")
    public String posts(){
        return "posts";
    }

    @GetMapping("/contato")
    public String contato(){
        return "contato";
    }
}

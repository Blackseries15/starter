package com.senac.starter.controllers;

import com.senac.starter.models.Usuario;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping("/")
public class SiteController {

    @GetMapping("/")
    public ModelAndView home(){
        //System.out.println("Entrou no home");
        ModelAndView modelAndView = new ModelAndView("home");
        Usuario usuario =new Usuario("Marcio",20,true);


        String casado;
        if (usuario.isCasado()) {
            casado = " Verificamos que você  casado.";
        } else {
            casado = " Verificamos que você não é casado.";

        }
        String saudacao = "Bem vindo ";
        String texto = " agora são ";
        LocalDateTime localDateTime = LocalDateTime.now();

        var str_hora = localDateTime.getHour() + " Horas e " + localDateTime.getMinute() + " Minutos.";
        String frase = saudacao + usuario.getNome() + texto + str_hora + casado;


        modelAndView.addObject("frase",frase);


        ;








      // modelAndView.addObject("texto",texto);
        return modelAndView;
    }

    @GetMapping("/jogos")
    public String jogos(){
        System.out.println("Entrou no jogos");
        return "jogos";
    }

    @GetMapping("/filmes")
    public String filmes(){
        System.out.println("Entrou no filmes");
        return "filmes";
    }

    @GetMapping("/posts")
    public String posts(){
        System.out.println("Entrou no posts");
        return "posts";
    }

    @GetMapping("/contato")
    public String contato(){
        System.out.println("Entrou no contato");
        return "contato";
    }
}

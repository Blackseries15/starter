package com.senac.starter.controllers;

import com.senac.starter.models.Usuario;
import com.senac.starter.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public ModelAndView listar(){
        ModelAndView modelAndView = new ModelAndView("usuarios");
        List<Usuario> usuarios = usuarioRepository.findAll();
        modelAndView.addObject("usuarios",usuarios);

        return modelAndView;
    }
}

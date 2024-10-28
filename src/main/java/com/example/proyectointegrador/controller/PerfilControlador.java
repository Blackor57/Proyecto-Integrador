package com.example.proyectointegrador.controller;

import com.example.proyectointegrador.entity.Usuario;
import com.example.proyectointegrador.services.UsuarioServicio;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerfilControlador {

    private final UsuarioServicio usuarioServicio;

    public PerfilControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @GetMapping("/profile")
    public String verPerfil(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        Usuario usuario = usuarioServicio.buscarPorEmail(email);
        model.addAttribute("usuario", usuario);
        return "profile";
    }
}
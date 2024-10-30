package com.example.proyectointegrador.controller;

import com.example.proyectointegrador.model.dto.UsuarioRegistroDTO;
import com.example.proyectointegrador.services.UsuarioServicio;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
// Esta clase se encargará de manejar las peticiones relacionadas con el registro de usuarios.
public class RegistroUsuarioControlador {

    private final UsuarioServicio usuarioServicio;

    public RegistroUsuarioControlador(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuario")
    public UsuarioRegistroDTO retornarNuevoUsuarioRegistro() {
        return new UsuarioRegistroDTO();
    }

    @GetMapping
    public String mostrarForularioRegistro() {
        return "register";
    }

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO, Model model) {
        try {
            usuarioServicio.save(registroDTO);
            return "redirect:/register?good";
        } catch (DataIntegrityViolationException e) {
            if (e.getMessage().contains("dni")) {
                model.addAttribute("dniError", true);
            } else if (e.getMessage().contains("email")) {
                model.addAttribute("emailError", true);
            }
            model.addAttribute("usuario", registroDTO);
            return "register";
        }
    }
}

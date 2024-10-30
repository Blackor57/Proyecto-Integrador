package com.example.proyectointegrador.services;


import com.example.proyectointegrador.model.dto.UsuarioRegistroDTO;
import com.example.proyectointegrador.model.entity.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioServicio extends UserDetailsService {
    public Usuario save(UsuarioRegistroDTO registroDTO);

    Usuario buscarPorEmail(String email);
}

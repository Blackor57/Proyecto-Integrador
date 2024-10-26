package com.example.proyectointegrador.services;


import com.example.proyectointegrador.dto.UsuarioRegistroDTO;
import com.example.proyectointegrador.entity.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsuarioServicio extends UserDetailsService {
    public Usuario save(UsuarioRegistroDTO registroDTO);

}

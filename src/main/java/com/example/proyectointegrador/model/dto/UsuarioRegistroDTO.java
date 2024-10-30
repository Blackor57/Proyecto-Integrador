package com.example.proyectointegrador.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
public class UsuarioRegistroDTO {

    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String apellido;
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    private String dni;

    @Getter
    @Setter
    private LocalDate birthDate;

}

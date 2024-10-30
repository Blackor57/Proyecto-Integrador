package com.example.proyectointegrador.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rol")
@NoArgsConstructor
public class Rol {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter
    @Setter
    private String nombre;

    public Rol(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }
}

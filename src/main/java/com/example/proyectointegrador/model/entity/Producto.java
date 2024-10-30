package com.example.proyectointegrador.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Column(nullable = false)
    @Getter
    @Setter
    private String nombre;

    @Column(nullable = false)
    @Getter
    @Setter
    private Double precio;

    @Getter
    @Setter
    private String descripcion;

    @Getter
    @Setter
    @Column(name = "imagen_url")
    private String imagenUrl;

    @Getter
    @Setter
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    @Getter
    @Setter
    private Categoria categoria;
}

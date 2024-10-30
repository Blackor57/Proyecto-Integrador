package com.example.proyectointegrador.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalles")
@NoArgsConstructor
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private int cantidad;

    @Getter
    @Setter
    private double precio;

    @Getter
    @Setter
    private double subtotal;

    @Getter
    @Setter
    @OneToOne
    private Orden orden;

    @Getter
    @Setter
    @OneToOne
    private Producto producto;

}

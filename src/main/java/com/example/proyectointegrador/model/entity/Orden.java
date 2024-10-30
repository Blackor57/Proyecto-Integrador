package com.example.proyectointegrador.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "ordenes")
@NoArgsConstructor
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String numero;

    @Getter
    @Setter
    private Date fechaCreacion;

    @Getter
    @Setter
    private Date fechaRecibida;

    @Getter
    @Setter
    private Double total;

    @Getter
    @Setter
    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;

    public Orden(long id, String numero, Date fechaCreacion, Date fechaRecibida, Double total, Usuario usuario, DetalleOrden detalle) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
        this.usuario = usuario;
        this.detalle = detalle;
    }
}

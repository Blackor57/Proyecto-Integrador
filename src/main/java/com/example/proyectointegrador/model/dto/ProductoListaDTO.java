package com.example.proyectointegrador.model.dto;

import lombok.Getter;
import lombok.Setter;

public class ProductoListaDTO {

    @Getter @Setter
    private long id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private Double precio;
    @Getter @Setter
    private String descripcion;
    @Getter @Setter
    private String imagenUrl;
    @Getter @Setter
    private Integer cantidad;

    @Getter @Setter
    private String categoriaNombre;
}

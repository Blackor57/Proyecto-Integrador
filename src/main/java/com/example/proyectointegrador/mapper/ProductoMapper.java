package com.example.proyectointegrador.mapper;

import com.example.proyectointegrador.model.dto.ProductoListaDTO;
import com.example.proyectointegrador.model.entity.Producto;

public class ProductoMapper {

    public static ProductoListaDTO toDTO(Producto producto) {
        ProductoListaDTO dto = new ProductoListaDTO();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setPrecio(producto.getPrecio());
        dto.setDescripcion(producto.getDescripcion());
        dto.setImagenUrl(producto.getImagenUrl());
        dto.setCantidad(producto.getCantidad());

        if (producto.getCategoria() != null) {
            dto.setCategoriaNombre(producto.getCategoria().getNombre());
        }

        return dto;
    }

}

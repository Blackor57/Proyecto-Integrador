package com.example.proyectointegrador.services;

import com.example.proyectointegrador.mapper.ProductoMapper;
import com.example.proyectointegrador.model.dto.ProductoListaDTO;
import com.example.proyectointegrador.model.entity.Producto;
import com.example.proyectointegrador.repository.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ProductoService {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<ProductoListaDTO> obtenerProductosPorCategoria(Long categoriaId) {
        List<Producto> productos = productoRepositorio.findByCategoriaId(categoriaId);
        return productos.stream()
                .map(ProductoMapper::toDTO)
                .collect(Collectors.toList());
    }
}

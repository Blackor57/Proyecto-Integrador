package com.example.proyectointegrador.repository;

import com.example.proyectointegrador.model.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    List<Producto> findByCategoriaId(Long categoriaId);

}

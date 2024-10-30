package com.example.proyectointegrador.controller;

import com.example.proyectointegrador.services.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class ProductoControlador {
    private final ProductoService productoService;
}

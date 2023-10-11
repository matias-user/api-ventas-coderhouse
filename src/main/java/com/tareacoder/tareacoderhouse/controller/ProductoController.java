package com.tareacoder.tareacoderhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tareacoder.tareacoderhouse.entity.Producto;
import com.tareacoder.tareacoderhouse.service.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;

    @GetMapping({"/",""})
    public List<Producto> obtenerTodos(){

        return productoService.obtenerTodos();
    }
}

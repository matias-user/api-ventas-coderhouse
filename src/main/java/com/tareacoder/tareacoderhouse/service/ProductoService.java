package com.tareacoder.tareacoderhouse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareacoder.tareacoderhouse.entity.Producto;
import com.tareacoder.tareacoderhouse.repository.ProductoRepository;
import com.tareacoder.tareacoderhouse.service.ProductoService;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos(){
        return productoRepository.findAll();
    }
    public Optional<Producto> buscarPorId(Integer id){

        return productoRepository.findById(id);
    }
}

package com.tareacoder.tareacoderhouse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tareacoder.tareacoderhouse.entity.Cliente;
import com.tareacoder.tareacoderhouse.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping({"/",""})
    public List<Cliente> obtenerTodos(){

        return clienteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> obtenerPorNombre(@PathVariable("id") String id){

        return clienteService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable("id") String id ){

        clienteService.eliminarPorId(id);
    }
}

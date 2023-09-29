package com.tareacoder.tareacoderhouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tareacoder.tareacoderhouse.domain.entity.Cliente;
import com.tareacoder.tareacoderhouse.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping({"/{nombre}"})
    public Cliente obtenerPorNombre(@PathVariable("nombre") String nombre){

        Cliente cliente = clienteService.obtenerPorNombre(nombre);

        return cliente;
    }
}

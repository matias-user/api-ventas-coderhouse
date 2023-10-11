package com.tareacoder.tareacoderhouse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareacoder.tareacoderhouse.entity.Cliente;
import com.tareacoder.tareacoderhouse.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    public Optional<Cliente> obtenerPorId(String id){
        
        Optional<Cliente> cliente = clienteRepository.findById(Integer.parseInt(id));
        return cliente;
    }
    public List<Cliente> obtenerTodos(){

        List<Cliente> clientes = clienteRepository.findAll();

        return clientes;
    }
    public void eliminarPorId(String id){

        clienteRepository.deleteById(Integer.parseInt(id));
    }
}

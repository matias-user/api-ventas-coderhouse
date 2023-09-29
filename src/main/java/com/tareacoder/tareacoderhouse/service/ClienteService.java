package com.tareacoder.tareacoderhouse.service;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareacoder.tareacoderhouse.domain.entity.Cliente;
import com.tareacoder.tareacoderhouse.domain.repository.ClienteRepository;
import com.tareacoder.tareacoderhouse.domain.repository.DAOFactory;

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

package com.tareacoder.tareacoderhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareacoder.tareacoderhouse.domain.entity.Cliente;
import com.tareacoder.tareacoderhouse.domain.repository.DAOFactory;

@Service
public class ClienteService {
    
    @Autowired
    private DAOFactory daoFactory;

    public Cliente obtenerPorNombre(String nombre){

        Cliente cliente = daoFactory.getClienteByNombre(nombre);
        return cliente;
    }

}

package com.tareacoder.tareacoderhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareacoder.tareacoderhouse.repository.ComprobanteRepository;

@Service
public class ComprobanteService {
    
    @Autowired
    private ComprobanteRepository comprobanteRepository;
    
    
}

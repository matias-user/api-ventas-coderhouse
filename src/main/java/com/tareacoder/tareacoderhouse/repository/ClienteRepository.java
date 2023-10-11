package com.tareacoder.tareacoderhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tareacoder.tareacoderhouse.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{}

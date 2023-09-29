package com.tareacoder.tareacoderhouse.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tareacoder.tareacoderhouse.domain.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{}

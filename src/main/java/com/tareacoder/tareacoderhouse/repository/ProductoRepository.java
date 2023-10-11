package com.tareacoder.tareacoderhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tareacoder.tareacoderhouse.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{}

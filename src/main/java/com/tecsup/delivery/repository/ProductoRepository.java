package com.tecsup.delivery.repository;

import com.tecsup.delivery.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
        extends JpaRepository<Producto,Long>{

}
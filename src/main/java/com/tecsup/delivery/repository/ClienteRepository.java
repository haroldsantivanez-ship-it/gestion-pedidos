package com.tecsup.delivery.repository;

import com.tecsup.delivery.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository
        extends JpaRepository<Cliente,Long>{

    boolean existsByCorreo(
            String correo
    );

}
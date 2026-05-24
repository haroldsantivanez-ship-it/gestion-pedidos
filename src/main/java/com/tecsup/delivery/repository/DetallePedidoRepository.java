package com.tecsup.delivery.repository;

import com.tecsup.delivery.model.DetallePedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository
        extends JpaRepository<
        DetallePedido,
        Long
        >{

}
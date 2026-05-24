package com.tecsup.delivery.repository;

import com.tecsup.delivery.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository
        extends JpaRepository<Pedido,Long>{

}
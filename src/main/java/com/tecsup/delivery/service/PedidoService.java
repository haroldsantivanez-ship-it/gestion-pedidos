package com.tecsup.delivery.service;

import com.tecsup.delivery.model.Pedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> listar();

    Pedido obtener(
            Long id
    );

    Pedido registrar(
            Pedido pedido
    );

    void eliminar(
            Long id
    );

}
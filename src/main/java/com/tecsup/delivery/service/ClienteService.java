package com.tecsup.delivery.service;

import com.tecsup.delivery.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> listar();

    Cliente obtener(Long id);

    Cliente guardar(
            Cliente cliente
    );

    Cliente actualizar(
            Long id,
            Cliente cliente
    );

    void eliminar(Long id);

}
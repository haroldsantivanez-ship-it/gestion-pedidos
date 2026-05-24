package com.tecsup.delivery.service;

import com.tecsup.delivery.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> listar();

    Producto obtener(
            Long id
    );

    Producto guardar(
            Producto producto
    );

    Producto actualizar(
            Long id,
            Producto producto
    );

    void eliminar(
            Long id
    );

}
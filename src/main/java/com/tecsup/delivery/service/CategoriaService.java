package com.tecsup.delivery.service;

import com.tecsup.delivery.model.Categoria;

import java.util.List;

public interface CategoriaService {

    List<Categoria> listar();

    Categoria guardar(
            Categoria categoria
    );

    Categoria actualizar(
            Long id,
            Categoria categoria
    );

    void eliminar(Long id);

}
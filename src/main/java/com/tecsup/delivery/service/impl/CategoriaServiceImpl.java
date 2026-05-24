package com.tecsup.delivery.service.impl;

import com.tecsup.delivery.model.Categoria;
import com.tecsup.delivery.repository.CategoriaRepository;
import com.tecsup.delivery.service.CategoriaService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl
        implements CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaServiceImpl(
            CategoriaRepository repository
    ){
        this.repository=repository;
    }

    @Override
    public List<Categoria> listar(){

        return repository.findAll();

    }

    @Override
    public Categoria guardar(
            Categoria categoria
    ){

        return repository.save(
                categoria
        );

    }

    @Override
    public Categoria actualizar(
            Long id,
            Categoria categoria
    ){

        Categoria actual=
                repository.findById(id)
                        .orElseThrow(
                                ()->new RuntimeException(
                                        "Categoria no encontrada"
                                ));

        actual.setNombre(
                categoria.getNombre()
        );

        return repository.save(
                actual);

    }

    @Override
    public void eliminar(
            Long id
    ){

        repository.deleteById(
                id
        );

    }

}
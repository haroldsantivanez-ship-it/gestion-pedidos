package com.tecsup.delivery.service.impl;

import com.tecsup.delivery.model.Producto;

import com.tecsup.delivery.repository.ProductoRepository;

import com.tecsup.delivery.service.ProductoService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl
        implements ProductoService {

    private final ProductoRepository repository;

    public ProductoServiceImpl(
            ProductoRepository repository
    ){
        this.repository=repository;
    }

    @Override
    public List<Producto> listar(){

        return repository.findAll();

    }

    @Override
    public Producto obtener(
            Long id
    ){

        return repository.findById(id)
                .orElseThrow(
                        ()->new RuntimeException(
                                "Producto no encontrado"
                        ));

    }

    @Override
    public Producto guardar(
            Producto producto
    ){

        return repository.save(
                producto
        );

    }

    @Override
    public Producto actualizar(
            Long id,
            Producto producto
    ){

        Producto actual=
                obtener(id);

        actual.setNombre(
                producto.getNombre()
        );

        actual.setDescripcion(
                producto.getDescripcion()
        );

        actual.setPrecio(
                producto.getPrecio()
        );

        actual.setStock(
                producto.getStock()
        );

        actual.setCategoria(
                producto.getCategoria()
        );

        return repository.save(
                actual
        );

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
package com.tecsup.delivery.controller;

import com.tecsup.delivery.model.Producto;

import com.tecsup.delivery.service.ProductoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(
        "/productos"
)

public class ProductoController {

    private final ProductoService service;

    public ProductoController(
            ProductoService service
    ){
        this.service=service;
    }

    @GetMapping

    public List<Producto> listar(){

        return service.listar();

    }

    @GetMapping("/{id}")

    public Producto obtener(
            @PathVariable Long id
    ){

        return service.obtener(id);

    }

    @PostMapping

    public Producto guardar(
            @RequestBody Producto producto
    ){

        return service.guardar(
                producto
        );

    }

    @PutMapping("/{id}")

    public Producto actualizar(

            @PathVariable Long id,

            @RequestBody Producto producto

    ){

        return service.actualizar(
                id,
                producto
        );

    }

    @DeleteMapping("/{id}")

    public void eliminar(
            @PathVariable Long id
    ){

        service.eliminar(id);

    }

}
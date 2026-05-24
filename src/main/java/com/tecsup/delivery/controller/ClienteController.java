package com.tecsup.delivery.controller;

import com.tecsup.delivery.model.Cliente;

import com.tecsup.delivery.service.ClienteService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(
        "/clientes"
)

public class ClienteController {

    private final ClienteService service;

    public ClienteController(
            ClienteService service
    ){

        this.service=service;

    }

    @GetMapping

    public List<Cliente> listar(){

        return service.listar();

    }

    @GetMapping("/{id}")

    public Cliente obtener(
            @PathVariable Long id
    ){

        return service.obtener(
                id
        );

    }

    @PostMapping

    public Cliente guardar(
            @RequestBody
            Cliente cliente
    ){

        return service.guardar(
                cliente
        );

    }

    @PutMapping("/{id}")

    public Cliente actualizar(

            @PathVariable Long id,

            @RequestBody Cliente cliente

    ){

        return service.actualizar(
                id,
                cliente
        );

    }

    @DeleteMapping("/{id}")

    public void eliminar(
            @PathVariable Long id
    ){

        service.eliminar(
                id
        );

    }

}
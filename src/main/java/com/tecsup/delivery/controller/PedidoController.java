package com.tecsup.delivery.controller;

import com.tecsup.delivery.model.Pedido;

import com.tecsup.delivery.service.PedidoService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(
        "/pedidos"
)

public class PedidoController {

    private final PedidoService service;

    public PedidoController(
            PedidoService service
    ){

        this.service=service;

    }

    @GetMapping

    public List<Pedido> listar(){

        return service.listar();

    }

    @PostMapping

    public Pedido guardar(

            @RequestBody
            Pedido pedido

    ){

        return service.registrar(
                pedido
        );

    }

}
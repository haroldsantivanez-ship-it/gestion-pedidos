package com.tecsup.delivery.controller;

import com.tecsup.delivery.model.Usuario;

import com.tecsup.delivery.service.UsuarioService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(
        "/usuarios"
)

public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(
            UsuarioService service
    ){
        this.service=service;
    }

    @GetMapping

    public List<Usuario> listar(){

        return service.listar();

    }

    @PostMapping

    public Usuario guardar(

            @RequestBody
            Usuario usuario

    ){

        return service.guardar(
                usuario
        );

    }

}
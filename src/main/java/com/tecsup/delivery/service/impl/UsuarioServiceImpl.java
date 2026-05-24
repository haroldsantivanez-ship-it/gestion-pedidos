package com.tecsup.delivery.service.impl;

import com.tecsup.delivery.model.Usuario;

import com.tecsup.delivery.repository.UsuarioRepository;

import com.tecsup.delivery.service.UsuarioService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsuarioServiceImpl
        implements UsuarioService {

    private final UsuarioRepository repo;

    public UsuarioServiceImpl(
            UsuarioRepository repo
    ){
        this.repo=repo;
    }

    @Override

    public List<Usuario> listar(){

        return repo.findAll();

    }

    @Override

    public Usuario guardar(
            Usuario usuario
    ){

        return repo.save(
                usuario
        );

    }

}
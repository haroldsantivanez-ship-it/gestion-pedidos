package com.tecsup.delivery.service;

import com.tecsup.delivery.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listar();

    Usuario guardar(
            Usuario usuario
    );

}
package com.tecsup.delivery.repository;

import com.tecsup.delivery.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository
        extends JpaRepository<
        Usuario,
        Long
        >{

}
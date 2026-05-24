package com.tecsup.delivery.repository;

import com.tecsup.delivery.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository
        extends JpaRepository<Categoria,Long>{

}
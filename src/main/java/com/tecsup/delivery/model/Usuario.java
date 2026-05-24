package com.tecsup.delivery.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;

    private String username;

    @JsonIgnore
    private String password;

    @OneToOne

    @JoinColumn(
            name="cliente_id"
    )

    private Cliente cliente;

    public Usuario(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(
            String username
    ){
        this.username=username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(
            String password
    ){
        this.password=password;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(
            Cliente cliente
    ){
        this.cliente=cliente;
    }

}
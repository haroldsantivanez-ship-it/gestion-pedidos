package com.tecsup.delivery.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="auditoria_log")

public class AuditoriaLog {

    @Id
    @GeneratedValue(
            strategy=GenerationType.IDENTITY
    )
    private Long id;

    private String accion;

    private String metodo;

    private String usuario;

    private String clase;

    private LocalDateTime fecha;

    public AuditoriaLog(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getAccion(){
        return accion;
    }

    public void setAccion(
            String accion
    ){
        this.accion=accion;
    }

    public String getMetodo(){
        return metodo;
    }

    public void setMetodo(
            String metodo
    ){
        this.metodo=metodo;
    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(
            String usuario
    ){
        this.usuario=usuario;
    }

    public String getClase(){
        return clase;
    }

    public void setClase(
            String clase
    ){
        this.clase=clase;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public void setFecha(
            LocalDateTime fecha
    ){
        this.fecha=fecha;
    }

}
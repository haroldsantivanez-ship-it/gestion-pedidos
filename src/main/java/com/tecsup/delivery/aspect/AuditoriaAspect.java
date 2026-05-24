package com.tecsup.delivery.aspect;

import com.tecsup.delivery.model.AuditoriaLog;
import com.tecsup.delivery.repository.AuditoriaLogRepository;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;

import org.aspectj.lang.annotation.Aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component

public class AuditoriaAspect {

    @Autowired
    private AuditoriaLogRepository repository;

    @After(
            "execution(* com.tecsup.delivery.service.impl.*.*(..))"
    )

    public void registrar(
            JoinPoint joinPoint
    ){

        AuditoriaLog log =
                new AuditoriaLog();

        log.setMetodo(
                joinPoint
                        .getSignature()
                        .getName()
        );

        log.setClase(
                joinPoint
                        .getTarget()
                        .getClass()
                        .getSimpleName()
        );

        log.setFecha(
                LocalDateTime.now()
        );

        log.setAccion(
                "EJECUCION"
        );

        log.setUsuario(
                "admin"
        );

        repository.save(
                log
        );

        System.out.println(
                "[AUDITORIA GUARDADA]"
        );

    }

}
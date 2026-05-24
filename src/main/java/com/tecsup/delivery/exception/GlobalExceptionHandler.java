package com.tecsup.delivery.exception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

import java.util.Map;

@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(
            ConstraintViolationException.class
    )

    public ResponseEntity<?> manejarValidacion(

            ConstraintViolationException ex

    ){

        Map<String,String> errores=
                new HashMap<>();

        for(
                ConstraintViolation<?> error
                :
                ex.getConstraintViolations()
        ){

            errores.put(
                    error.getPropertyPath().toString(),
                    error.getMessage()
            );

        }

        return new ResponseEntity<>(
                errores,
                HttpStatus.BAD_REQUEST
        );

    }

    @ExceptionHandler(
            RuntimeException.class
    )

    public ResponseEntity<?> manejarRuntime(

            RuntimeException ex

    ){

        Map<String,String> r=
                new HashMap<>();

        r.put(
                "error",
                ex.getMessage()
        );

        return new ResponseEntity<>(
                r,
                HttpStatus.BAD_REQUEST
        );

    }

}
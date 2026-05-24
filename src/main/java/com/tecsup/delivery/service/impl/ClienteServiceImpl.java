package com.tecsup.delivery.service.impl;

import com.tecsup.delivery.model.Cliente;
import com.tecsup.delivery.repository.ClienteRepository;
import com.tecsup.delivery.service.ClienteService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl
        implements ClienteService {

    private final ClienteRepository repository;

    public ClienteServiceImpl(
            ClienteRepository repository
    ){
        this.repository=repository;
    }

    @Override
    public List<Cliente> listar(){

        return repository.findAll();

    }

    @Override
    public Cliente obtener(
            Long id
    ){

        return repository.findById(id)
                .orElseThrow(
                        ()->new RuntimeException(
                                "Cliente no encontrado"
                        ));

    }

    @Override
    public Cliente guardar(
            Cliente cliente
    ){

        if(
                repository.existsByCorreo(
                        cliente.getCorreo()
                )
        ){
            throw new RuntimeException(
                    "Correo ya registrado"
            );
        }

        return repository.save(
                cliente
        );

    }

    @Override
    public Cliente actualizar(
            Long id,
            Cliente cliente
    ){

        Cliente actual=
                obtener(id);

        actual.setNombres(
                cliente.getNombres()
        );

        actual.setApellidos(
                cliente.getApellidos()
        );

        actual.setCorreo(
                cliente.getCorreo()
        );

        actual.setTelefono(
                cliente.getTelefono()
        );

        actual.setDireccion(
                cliente.getDireccion()
        );

        return repository.save(
                actual
        );

    }

    @Override
    public void eliminar(
            Long id
    ){

        repository.deleteById(
                id
        );

    }

}
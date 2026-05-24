package com.tecsup.delivery.service.impl;

import com.tecsup.delivery.model.*;

import com.tecsup.delivery.repository.*;

import com.tecsup.delivery.service.PedidoService;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoServiceImpl
        implements PedidoService {

    private final PedidoRepository pedidoRepository;

    private final ProductoRepository productoRepository;

    public PedidoServiceImpl(

            PedidoRepository pedidoRepository,

            ProductoRepository productoRepository

    ){

        this.pedidoRepository=pedidoRepository;

        this.productoRepository=productoRepository;

    }

    @Override
    public List<Pedido> listar(){

        return pedidoRepository.findAll();

    }

    @Override
    public Pedido obtener(
            Long id
    ){

        return pedidoRepository.findById(id)

                .orElseThrow(

                        ()->new RuntimeException(
                                "Pedido no encontrado"
                        )

                );

    }

    @Override
    public Pedido registrar(
            Pedido pedido
    ){

        double total=0;

        for(
                DetallePedido d:
                pedido.getDetalles()
        ){

            Producto producto=

                    productoRepository

                            .findById(
                                    d.getProducto().getId()
                            )

                            .orElseThrow(
                                    ()->new RuntimeException(
                                            "Producto no encontrado"
                                    )
                            );

            if(
                    producto.getStock()
                            <
                            d.getCantidad()
            ){

                throw new RuntimeException(
                        "Stock insuficiente"
                );

            }

            double subtotal=

                    producto.getPrecio()

                            *

                            d.getCantidad();

            d.setSubtotal(
                    subtotal
            );

            producto.setStock(

                    producto.getStock()

                            -

                            d.getCantidad()

            );

            productoRepository.save(
                    producto
            );

            d.setPedido(
                    pedido
            );

            total+=subtotal;

        }

        pedido.setFecha(
                LocalDate.now()
        );

        pedido.setTotal(
                total
        );

        return pedidoRepository.save(
                pedido
        );

    }

    @Override
    public void eliminar(
            Long id
    ){

        pedidoRepository.deleteById(
                id
        );

    }

}
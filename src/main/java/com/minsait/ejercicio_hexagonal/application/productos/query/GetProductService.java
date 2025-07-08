package com.minsait.ejercicio_hexagonal.application.productos.query;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;
import com.minsait.ejercicio_hexagonal.domain.productos.port.in.GetProductoByIdUseCase;
import com.minsait.ejercicio_hexagonal.domain.productos.port.out.GetProductoByIdPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetProductService implements GetProductoByIdUseCase{

    private final GetProductoByIdPort getProductoByIdPort;

    @Override
    public Producto getProductById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

}

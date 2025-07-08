package com.minsait.ejercicio_hexagonal.application.productos.query;

import org.springframework.stereotype.Service;

import com.minsait.ejercicio_hexagonal.application.productos.exception.ProductoNotFoundException;
import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;
import com.minsait.ejercicio_hexagonal.domain.productos.port.in.GetProductoByIdUseCase;
import com.minsait.ejercicio_hexagonal.domain.productos.port.out.GetProductoByIdPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetProductoService implements GetProductoByIdUseCase {

    private final GetProductoByIdPort getProductoByIdPort;

    @Override
    public Producto getProductById(Long id) {
        return getProductoByIdPort.getProductoById(id)
                .orElseThrow(() -> new ProductoNotFoundException(id));
    }

}

package com.minsait.ejercicio_hexagonal.application.productos.command;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoCreateCommand;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;
import com.minsait.ejercicio_hexagonal.domain.productos.port.in.CreateProductoUseCase;
import com.minsait.ejercicio_hexagonal.domain.productos.port.out.SaveProductoPort;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateProductoService implements CreateProductoUseCase{

    private final SaveProductoPort saveProductPort;

    @Override
    public ProductoResponse createProducto(ProductoCreateCommand producto) {
        return saveProductPort.saveProducto(producto);
    }

}

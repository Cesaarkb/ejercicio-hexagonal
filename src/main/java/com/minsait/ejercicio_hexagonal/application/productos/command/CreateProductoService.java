package com.minsait.ejercicio_hexagonal.application.productos.command;

import org.springframework.stereotype.Service;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoCreateCommand;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;
import com.minsait.ejercicio_hexagonal.application.productos.mapper.ProductoMapper;
import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;
import com.minsait.ejercicio_hexagonal.domain.productos.port.in.CreateProductoUseCase;
import com.minsait.ejercicio_hexagonal.domain.productos.port.out.SaveProductoPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateProductoService implements CreateProductoUseCase{

    private final SaveProductoPort saveProductPort;

    @Override
    public ProductoResponse createProducto(ProductoCreateCommand command) {
        Producto response = ProductoMapper.toDomain(command);
        Producto saved = saveProductPort.saveProducto(response);
        return ProductoMapper.toResponse(saved);

    }

}

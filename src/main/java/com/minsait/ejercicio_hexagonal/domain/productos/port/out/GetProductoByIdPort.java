package com.minsait.ejercicio_hexagonal.domain.productos.port.out;

import java.util.Optional;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;

public interface GetProductoByIdPort {
    Optional<ProductoResponse> getProductoById(Long id);
}

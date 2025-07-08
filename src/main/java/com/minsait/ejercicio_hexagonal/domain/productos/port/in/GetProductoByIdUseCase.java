package com.minsait.ejercicio_hexagonal.domain.productos.port.in;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;

public interface GetProductoByIdUseCase {
    Producto getProductById(Long id);
}

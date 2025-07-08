package com.minsait.ejercicio_hexagonal.domain.productos.port.out;

import java.util.Optional;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;

public interface GetProductoByIdPort {
    Optional<Producto> getProductoById(Long id);
}

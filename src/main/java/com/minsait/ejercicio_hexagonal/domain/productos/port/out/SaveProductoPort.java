package com.minsait.ejercicio_hexagonal.domain.productos.port.out;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;

public interface SaveProductoPort {
    Producto saveProducto(Producto producto);
}

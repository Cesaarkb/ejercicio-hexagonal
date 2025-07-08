package com.minsait.ejercicio_hexagonal.domain.productos.port.out;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoCreateCommand;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;

public interface SaveProductoPort {
    ProductoResponse saveProducto(ProductoCreateCommand producto);
}

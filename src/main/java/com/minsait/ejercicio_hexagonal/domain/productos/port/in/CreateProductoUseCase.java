package com.minsait.ejercicio_hexagonal.domain.productos.port.in;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoCreateCommand;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;

public interface CreateProductoUseCase {
ProductoResponse  createProducto(ProductoCreateCommand producto);
}

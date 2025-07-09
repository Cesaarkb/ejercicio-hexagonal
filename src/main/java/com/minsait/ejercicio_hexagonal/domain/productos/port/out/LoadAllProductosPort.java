package com.minsait.ejercicio_hexagonal.domain.productos.port.out;

import java.util.List;
import java.util.Optional;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;

public interface LoadAllProductosPort {

    List<Producto> findAllByIds(List<Long> ids);
     Optional<Producto> getProductoById(Long id);

}

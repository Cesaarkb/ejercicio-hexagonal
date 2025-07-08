package com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.mapper;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;
import com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.entity.ProductoEntity;

public class ProductoEntityMapper {

    public static ProductoEntity toEntity(Producto producto){
            return new ProductoEntity(
                producto.getId(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getStock()
            );
    }

    public static Producto toDomain(ProductoEntity entity){
        return new Producto(
            entity.getId(),
            entity.getNombre(),
            entity.getPrecio(),
            entity.getStock());
    }

}

package com.minsait.ejercicio_hexagonal.application.productos.mapper;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoCreateCommand;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponseToVenta;
import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;

public class ProductoMapper {

    public static Producto toDomain(ProductoCreateCommand dto) {
        return new Producto(
                null,
                dto.getNombre(),
                dto.getPrecio(),
                dto.getStock());
    }

    public static ProductoCreateCommand toCreateCommand(Producto producto) {
        ProductoCreateCommand dto = new ProductoCreateCommand();
        dto.setNombre(producto.getNombre());
        dto.setPrecio(producto.getPrecio());
        dto.setStock(producto.getStock());
        return dto;
    }

    public static ProductoResponse toResponse(Producto producto) {
        ProductoResponse response = new ProductoResponse();
        response.setId(producto.getId());
        response.setNombre(producto.getNombre());
        response.setPrecio(producto.getPrecio());
        return response;

    }

    public static ProductoResponseToVenta toResponseToVenta(Producto producto){
        ProductoResponseToVenta responseToVenta = new ProductoResponseToVenta();
        responseToVenta.setId(producto.getId());
        responseToVenta.setNombre(producto.getNombre());
        responseToVenta.setCantidadItems(producto.getStock());
        responseToVenta.setPrecio(producto.getPrecio());
        return responseToVenta;
    }
}

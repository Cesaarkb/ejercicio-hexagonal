package com.minsait.ejercicio_hexagonal.application.compras.mapper;

import java.util.List;

import com.minsait.ejercicio_hexagonal.application.compras.dto.VentaResponseDTO;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponseToVenta;
import com.minsait.ejercicio_hexagonal.application.productos.mapper.ProductoMapper;
import com.minsait.ejercicio_hexagonal.domain.compras.model.Venta;

public class VentaMapper {


    public static VentaResponseDTO toResponse(Venta venta){
         VentaResponseDTO dto = new VentaResponseDTO();
    dto.setId(venta.getId());
    dto.setClienteId(venta.getCliente().getId());
    dto.setFechaCompra(venta.getFechaCompra());
    dto.setPrecioTotal(venta.getPrecioTotal());

    List<ProductoResponseToVenta> productosResponse = venta.getItems().stream()
        .map(itemVenta -> ProductoMapper.toResponseToVenta(itemVenta.getProducto()))
        .toList();

    dto.setProductos(productosResponse);
    return dto;
    }

}

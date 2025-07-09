package com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.mapper;

import java.util.List;

import com.minsait.ejercicio_hexagonal.domain.compras.model.ItemVenta;
import com.minsait.ejercicio_hexagonal.domain.compras.model.Venta;
import com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.mapper.ClienteEntityMapper;
import com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.entity.VentaEntity;
import com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.entity.VentaProductoEntity;
import com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.mapper.ProductoEntityMapper;

public class VentaEntityMapper {

   public static VentaEntity toEntity(Venta venta){
        VentaEntity ventaEntity = new VentaEntity();
        ventaEntity.setId(venta.getId());
        ventaEntity.setCliente(ClienteEntityMapper.toEntity(venta.getCliente()));

        List<VentaProductoEntity> detalles = venta.getItems().stream()
            .map(itemVenta -> {
                VentaProductoEntity detalle = new VentaProductoEntity();
                detalle.setProducto(ProductoEntityMapper.toEntity(itemVenta.getProducto()));
                detalle.setCantidad(itemVenta.getCantidad());
                detalle.setVenta(ventaEntity);
                return detalle;
            })
            .toList();

        ventaEntity.setDetalles(detalles);
        ventaEntity.setPrecioTotal(venta.getPrecioTotal());
        ventaEntity.setFechaCompra(venta.getFechaCompra());

        return ventaEntity;
    }

    public static Venta toDomain(VentaEntity entity) {
        List<ItemVenta> items = entity.getDetalles().stream()
            .map(detalle -> new ItemVenta(
                ProductoEntityMapper.toDomain(detalle.getProducto()),
                detalle.getCantidad()
            ))
            .toList();

        return new Venta(
            entity.getId(),
            ClienteEntityMapper.toDomain(entity.getCliente()),
            items
        );
    }
}

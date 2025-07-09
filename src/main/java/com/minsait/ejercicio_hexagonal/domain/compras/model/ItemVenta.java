package com.minsait.ejercicio_hexagonal.domain.compras.model;

import java.math.BigDecimal;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;

public class ItemVenta {
    private final Producto producto;
    private final int cantidad;

    public ItemVenta(Producto producto, int cantidad) {
        if (producto == null || cantidad <= 0) {
            throw new IllegalArgumentException("Producto inválido o cantidad no válida");
        }
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public BigDecimal calcularSubtotal() {
        return producto.getPrecio().multiply(BigDecimal.valueOf(cantidad));
    }

}

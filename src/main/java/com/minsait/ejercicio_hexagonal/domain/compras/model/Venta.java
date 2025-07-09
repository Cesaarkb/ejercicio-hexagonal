package com.minsait.ejercicio_hexagonal.domain.compras.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.domain.compras.exception.ClienteNotValidException;
import com.minsait.ejercicio_hexagonal.domain.compras.exception.ProductosNotValidException;

import lombok.Getter;

@Getter
public class Venta {
    private final Long id;
    private final Cliente cliente;
    private final List<ItemVenta> items;
    private final BigDecimal precioTotal;
    private final LocalDate fechaCompra;

    public Venta(Long id, Cliente cliente, List<ItemVenta> items) {
        if(cliente == null){
            throw new ClienteNotValidException();
        }
        if(items == null || items.isEmpty()){
         throw new ProductosNotValidException();
        }

        this.id = id;
        this.cliente = cliente;
        this.items = items;
        this.precioTotal = calcularTotal();
        this.fechaCompra = LocalDate.now();
    }
    private BigDecimal calcularTotal() {
         return items.stream()
        .map(ItemVenta::calcularSubtotal)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

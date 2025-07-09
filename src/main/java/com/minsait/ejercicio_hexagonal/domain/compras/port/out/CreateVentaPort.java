package com.minsait.ejercicio_hexagonal.domain.compras.port.out;

import com.minsait.ejercicio_hexagonal.domain.compras.model.Venta;

public interface CreateVentaPort {
    Venta saveVenta(Venta venta);
}

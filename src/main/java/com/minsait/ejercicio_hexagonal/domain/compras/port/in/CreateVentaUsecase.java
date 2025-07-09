package com.minsait.ejercicio_hexagonal.domain.compras.port.in;

import java.util.List;

import com.minsait.ejercicio_hexagonal.application.compras.dto.ProductoCantidadDTO;
import com.minsait.ejercicio_hexagonal.domain.compras.model.Venta;

public interface CreateVentaUsecase {
     Venta createVenta(Long clienteId, List<ProductoCantidadDTO> productosIds);
}

package com.minsait.ejercicio_hexagonal.application.compras.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponseToVenta;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class VentaResponseDTO {
    private Long id;
    private Long clienteId;
    private List<ProductoResponseToVenta> productos;
    private BigDecimal precioTotal;
    private LocalDate fechaCompra;

}

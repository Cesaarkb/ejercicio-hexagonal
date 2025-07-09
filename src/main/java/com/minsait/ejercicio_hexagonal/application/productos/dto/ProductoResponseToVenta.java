package com.minsait.ejercicio_hexagonal.application.productos.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductoResponseToVenta {

    private Long id;
    private String nombre;
    private Integer cantidadItems;
    private BigDecimal precio;
}

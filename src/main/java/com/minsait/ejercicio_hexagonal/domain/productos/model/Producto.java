package com.minsait.ejercicio_hexagonal.domain.productos.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Producto {

    private final Long id;
    private final String nombre;
    private final BigDecimal precio;
    private final Integer stock;

}

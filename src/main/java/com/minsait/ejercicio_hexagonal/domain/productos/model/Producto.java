package com.minsait.ejercicio_hexagonal.domain.productos.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Producto {

    private final Long id;
    private final String nombre;
    private final Double precio;
    private final Integer stock;

}

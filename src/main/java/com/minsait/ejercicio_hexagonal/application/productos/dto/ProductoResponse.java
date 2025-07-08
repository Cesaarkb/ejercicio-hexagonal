package com.minsait.ejercicio_hexagonal.application.productos.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ProductoResponse {

    private Long id;
    private String nombre;
    private Double precio;
}

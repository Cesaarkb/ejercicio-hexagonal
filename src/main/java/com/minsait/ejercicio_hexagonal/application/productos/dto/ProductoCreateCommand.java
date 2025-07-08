package com.minsait.ejercicio_hexagonal.application.productos.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductoCreateCommand {
private String nombre;
private Double precio;
private Integer stock;   

}

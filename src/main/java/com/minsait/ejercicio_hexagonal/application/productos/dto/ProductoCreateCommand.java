package com.minsait.ejercicio_hexagonal.application.productos.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductoCreateCommand {
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;
    @NotNull(message = "El precio no puede estar vacio")
    @DecimalMin(value = "1.0", message = "El precio debe ser mayor a 0")
    private BigDecimal precio;
    @NotNull(message = "El stock no debe estar vacio")
    @Min(value = 0, message = "No debe ser menor a cero")
    private Integer stock;

}

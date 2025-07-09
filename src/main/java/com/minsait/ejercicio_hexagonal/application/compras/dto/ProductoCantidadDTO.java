package com.minsait.ejercicio_hexagonal.application.compras.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ProductoCantidadDTO {
      @NotNull(message = "El ID del producto no puede ser nulo")
    private Long productoId;

    @Min(value = 1, message = "La cantidad debe ser mayor o igual a 1")
    private int cantidad;

}

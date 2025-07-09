package com.minsait.ejercicio_hexagonal.application.compras.dto;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CreateVentaCommand {
    @NotNull(message="La venta debe tener un cliente valido asignado")
    private Long clienteId;
    @NotEmpty(message="Se debe incluir al menos un producto con su cantidad")
    private List<ProductoCantidadDTO> productos;
}

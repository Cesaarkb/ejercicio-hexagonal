package com.minsait.ejercicio_hexagonal.application.clientes.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CreateClienteCommand {
    
    @NotBlank(message="El nombre no puede estar vacio")
    private String nombre;
    @NotBlank(message="El apellido no puede estar vacio")
    private String apellido;
    @NotBlank(message="El email no puede estar vacio")
    @Email(message="Debe ser un correo válido")
    private String email;
    @NotBlank(message="El telefono no puede estar vacio")
    private String telefono;
    @NotBlank(message="La dirección no puede estar vacio")
    private String direccion;
}

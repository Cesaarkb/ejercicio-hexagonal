package com.minsait.ejercicio_hexagonal.application.clientes.mapper;

import com.minsait.ejercicio_hexagonal.application.clientes.dto.ClienteResponseDTO;
import com.minsait.ejercicio_hexagonal.application.clientes.dto.CreateClienteCommand;
import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;

public class ClienteMapper {

    public static Cliente toDomain(CreateClienteCommand dto){
        return new Cliente(
        null,
        dto.getNombre(),
        dto.getApellido(),
        dto.getEmail(),
        dto.getTelefono(),
        dto.getDireccion()
        );
    }

    public static CreateClienteCommand toCreateCommand(Cliente cliente) {
        CreateClienteCommand dto = new CreateClienteCommand();
        dto.setNombre(cliente.getNombre());
        dto.setApellido(cliente.getApellido());
        dto.setEmail(cliente.getEmail());
        dto.setTelefono(cliente.getTelefono());
        dto.setDireccion(cliente.getDireccion());
        return dto;
    }

    public static ClienteResponseDTO toResponseDTO(Cliente cliente) {
    ClienteResponseDTO dto = new ClienteResponseDTO();
    dto.setId(cliente.getId());
    dto.setNombre(cliente.getNombre());
    dto.setApellido(cliente.getApellido());
    dto.setEmail(cliente.getEmail());
    dto.setTelefono(cliente.getTelefono());
    dto.setDireccion(cliente.getDireccion());
    return dto;
}

}

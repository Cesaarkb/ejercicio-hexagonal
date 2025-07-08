package com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.mapper;

import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.entity.ClienteEntity;

public class ClienteEntityMapper {

    public static ClienteEntity toEntity(Cliente cliente){
        return new ClienteEntity(
        cliente.getId(),
        cliente.getNombre(),
        cliente.getApellido(),
        cliente.getEmail(),
        cliente.getTelefono(),
        cliente.getDireccion()
        );
    }

    public static Cliente toDomain(ClienteEntity entity){
        return new Cliente(entity.getId(), 
        entity.getNombre(),
        entity.getApellido(),
        entity.getEmail(), 
        entity.getTelefono(),
        entity.getDireccion());
    }

}

package com.minsait.ejercicio_hexagonal.application.clientes.command;

import org.springframework.stereotype.Service;

import com.minsait.ejercicio_hexagonal.application.clientes.dto.CreateClienteCommand;
import com.minsait.ejercicio_hexagonal.application.clientes.mapper.ClienteMapper;
import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.in.CreateClienteUseCase;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.out.SaveClientePort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateClienteService implements CreateClienteUseCase{

    private final SaveClientePort saveClientePort;

    @Override
    public Cliente createCliente(CreateClienteCommand clienteCommand) {
        Cliente cliente = ClienteMapper.toDomain(clienteCommand);
        return saveClientePort.createCliente(cliente);
    }

}

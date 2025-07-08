package com.minsait.ejercicio_hexagonal.application.clientes.query;

import org.springframework.stereotype.Service;

import com.minsait.ejercicio_hexagonal.application.clientes.exception.ClienteNotFoundException;
import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.in.GetClienteByIdUseCase;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.out.GetClientePort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetClienteByIdService implements GetClienteByIdUseCase {

    private final GetClientePort getClientePort;

    @Override
    public Cliente getClientById(Long id) {
        return getClientePort.getClienteById(id)
                .orElseThrow(() -> new ClienteNotFoundException(id));
    }

}

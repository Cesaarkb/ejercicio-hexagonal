package com.minsait.ejercicio_hexagonal.domain.clientes.port.in;

import com.minsait.ejercicio_hexagonal.application.clientes.dto.CreateClienteCommand;
import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;

public interface CreateClienteUseCase {
    Cliente createCliente(CreateClienteCommand cliente);
}

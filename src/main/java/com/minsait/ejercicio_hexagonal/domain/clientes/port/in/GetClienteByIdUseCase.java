package com.minsait.ejercicio_hexagonal.domain.clientes.port.in;

import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;

public interface GetClienteByIdUseCase {
    Cliente getClientById(Long id);

}

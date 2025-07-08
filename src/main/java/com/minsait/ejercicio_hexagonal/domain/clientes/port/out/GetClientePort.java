package com.minsait.ejercicio_hexagonal.domain.clientes.port.out;

import java.util.Optional;

import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;

public interface GetClientePort {
Optional<Cliente> getClienteById(Long id);
}

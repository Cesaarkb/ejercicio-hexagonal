package com.minsait.ejercicio_hexagonal.domain.clientes.port.out;

import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;

public interface SaveClientePort {
Cliente createCliente(Cliente cliente);
}

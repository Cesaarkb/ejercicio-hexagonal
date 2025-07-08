package com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.jpa.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.out.GetClientePort;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.out.SaveClientePort;
import com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.entity.ClienteEntity;
import com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.jpa.repository.ClienteJpaRepository;
import com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.mapper.ClienteEntityMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ClienteJpaAdapter implements GetClientePort, SaveClientePort{

    private final ClienteJpaRepository clienteJpaRepository;

    @Override
    public Cliente createCliente(Cliente cliente) {
        ClienteEntity entity = ClienteEntityMapper.toEntity(cliente);
        ClienteEntity saved = clienteJpaRepository.save(entity);
        return ClienteEntityMapper.toDomain(saved); 
    }

    @Override
    public Optional<Cliente> getClienteById(Long id) {
        return clienteJpaRepository.findById(id)
            .map(ClienteEntityMapper::toDomain);
    }

}

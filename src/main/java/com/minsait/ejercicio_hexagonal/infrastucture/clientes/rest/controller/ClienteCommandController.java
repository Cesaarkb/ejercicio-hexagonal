package com.minsait.ejercicio_hexagonal.infrastucture.clientes.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.ejercicio_hexagonal.application.clientes.dto.ClienteResponseDTO;
import com.minsait.ejercicio_hexagonal.application.clientes.dto.CreateClienteCommand;
import com.minsait.ejercicio_hexagonal.application.clientes.mapper.ClienteMapper;
import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.in.CreateClienteUseCase;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class ClienteCommandController {

    private final CreateClienteUseCase createClienteUseCase;

    public ClienteCommandController(CreateClienteUseCase createClienteUseCase){
        this.createClienteUseCase = createClienteUseCase;
    }

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> createCliente(
        @Valid @RequestBody CreateClienteCommand clienteCommand){

    Cliente clienteCreado = createClienteUseCase.createCliente(clienteCommand);
    ClienteResponseDTO responseDto = ClienteMapper.toResponseDTO(clienteCreado);

    return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
}

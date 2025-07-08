package com.minsait.ejercicio_hexagonal.infrastucture.clientes.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.ejercicio_hexagonal.application.clientes.dto.ClienteResponseDTO;
import com.minsait.ejercicio_hexagonal.application.clientes.mapper.ClienteMapper;
import com.minsait.ejercicio_hexagonal.domain.clientes.model.Cliente;
import com.minsait.ejercicio_hexagonal.domain.clientes.port.in.GetClienteByIdUseCase;


@RestController
@RequestMapping("/users")
public class ClienteQueryController {

    private final GetClienteByIdUseCase getClienteByIdUseCase;

    public ClienteQueryController( GetClienteByIdUseCase getClienteByIdUseCase){
        this.getClienteByIdUseCase = getClienteByIdUseCase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> getClienteById(@PathVariable Long id) {
        Cliente cliente = getClienteByIdUseCase.getClientById(id);
        ClienteResponseDTO response = ClienteMapper.toResponseDTO(cliente);
        return ResponseEntity.ok(response);
    }
    
}

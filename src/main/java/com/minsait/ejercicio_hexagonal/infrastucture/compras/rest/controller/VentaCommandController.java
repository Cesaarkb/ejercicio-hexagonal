package com.minsait.ejercicio_hexagonal.infrastucture.compras.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.ejercicio_hexagonal.application.compras.dto.CreateVentaCommand;
import com.minsait.ejercicio_hexagonal.application.compras.dto.VentaResponseDTO;
import com.minsait.ejercicio_hexagonal.application.compras.mapper.VentaMapper;
import com.minsait.ejercicio_hexagonal.domain.compras.model.Venta;
import com.minsait.ejercicio_hexagonal.domain.compras.port.in.CreateVentaUsecase;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/ventas")
@RequiredArgsConstructor
public class VentaCommandController {

    private final CreateVentaUsecase createVentaUsecase;

    @PostMapping
    public ResponseEntity<VentaResponseDTO> createVenta(@Valid @RequestBody CreateVentaCommand venta) {
        Venta ventaDomain = createVentaUsecase.createVenta(
        venta.getClienteId(), 
        venta.getProductos()
    );

    VentaResponseDTO ventaResponse = VentaMapper.toResponse(ventaDomain);
    
    return ResponseEntity.status(HttpStatus.CREATED).body(ventaResponse);
    }
    

}

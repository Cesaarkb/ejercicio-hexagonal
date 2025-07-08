package com.minsait.ejercicio_hexagonal.infrastucture.productos.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoCreateCommand;
import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;
import com.minsait.ejercicio_hexagonal.domain.productos.port.in.CreateProductoUseCase;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoCommandController {

private final CreateProductoUseCase createProductoUseCase;


@PostMapping
public ResponseEntity<ProductoResponse> createProducto(
            @Valid @RequestBody ProductoCreateCommand productoCommand) {

        ProductoResponse response = createProductoUseCase.createProducto(productoCommand);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}

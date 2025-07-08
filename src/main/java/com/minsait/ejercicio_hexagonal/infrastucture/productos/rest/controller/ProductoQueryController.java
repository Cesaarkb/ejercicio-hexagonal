package com.minsait.ejercicio_hexagonal.infrastucture.productos.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minsait.ejercicio_hexagonal.application.productos.dto.ProductoResponse;
import com.minsait.ejercicio_hexagonal.application.productos.mapper.ProductoMapper;
import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;
import com.minsait.ejercicio_hexagonal.domain.productos.port.in.GetProductoByIdUseCase;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class ProductoQueryController {

    private final GetProductoByIdUseCase getProductoByIdUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<ProductoResponse> getProductoById(@PathVariable Long id){
        Producto producto = getProductoByIdUseCase.getProductById(id);
        ProductoResponse response = ProductoMapper.toResponse(producto);
        return ResponseEntity.ok(response);
    }

}

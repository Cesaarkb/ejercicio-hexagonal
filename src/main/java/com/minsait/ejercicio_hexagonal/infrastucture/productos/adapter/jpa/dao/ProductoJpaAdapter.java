package com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.jpa.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.minsait.ejercicio_hexagonal.domain.productos.model.Producto;
import com.minsait.ejercicio_hexagonal.domain.productos.port.out.GetProductoByIdPort;
import com.minsait.ejercicio_hexagonal.domain.productos.port.out.SaveProductoPort;
import com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.entity.ProductoEntity;
import com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.jpa.repository.ProductoJpaRepository;
import com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.mapper.ProductoEntityMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ProductoJpaAdapter implements GetProductoByIdPort, SaveProductoPort{

    private final ProductoJpaRepository productoJpaRepository;

    @Override
    public Producto saveProducto(Producto producto) {
        ProductoEntity entity = ProductoEntityMapper.toEntity(producto);
        ProductoEntity save = productoJpaRepository.save(entity);
        return ProductoEntityMapper.toDomain(save);
    }

    @Override
    public Optional<Producto> getProductoById(Long id) {
        return productoJpaRepository.findById(id)
        .map(ProductoEntityMapper::toDomain);
    }

}

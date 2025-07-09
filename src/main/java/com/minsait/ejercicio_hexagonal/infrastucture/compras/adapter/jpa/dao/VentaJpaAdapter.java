package com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.jpa.dao;

import org.springframework.stereotype.Repository;

import com.minsait.ejercicio_hexagonal.domain.compras.model.Venta;
import com.minsait.ejercicio_hexagonal.domain.compras.port.out.CreateVentaPort;
import com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.entity.VentaEntity;
import com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.jpa.repository.CompraJpaRepository;
import com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.mapper.VentaEntityMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class VentaJpaAdapter implements CreateVentaPort{

    private final CompraJpaRepository ventaJpaRepository;
    @Override
    public Venta saveVenta(Venta venta) {
        VentaEntity entity = VentaEntityMapper.toEntity(venta);
        
        VentaEntity savedEntity = ventaJpaRepository.save(entity);
        
        return VentaEntityMapper.toDomain(savedEntity);
    }

}

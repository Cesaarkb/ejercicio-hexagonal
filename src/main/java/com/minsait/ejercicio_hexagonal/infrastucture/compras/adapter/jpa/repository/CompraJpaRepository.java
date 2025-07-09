package com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minsait.ejercicio_hexagonal.infrastucture.compras.adapter.entity.VentaEntity;

@Repository
public interface CompraJpaRepository extends JpaRepository<VentaEntity, Long>{

}

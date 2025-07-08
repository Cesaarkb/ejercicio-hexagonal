package com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minsait.ejercicio_hexagonal.infrastucture.productos.adapter.entity.ProductoEntity;

@Repository
public interface ProductoJpaRepository extends JpaRepository<ProductoEntity, Long>{

}

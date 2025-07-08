package com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minsait.ejercicio_hexagonal.infrastucture.clientes.adapter.entity.ClienteEntity;

@Repository
public interface ClienteJpaRepository extends JpaRepository<ClienteEntity, Long>{

}

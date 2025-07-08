package com.minsait.ejercicio_hexagonal.application.productos.exception;

public class ProductoNotFoundException extends RuntimeException{
    public ProductoNotFoundException(Long id){
        super("Producto con Id: " + id + " no encontrado");
    }

}

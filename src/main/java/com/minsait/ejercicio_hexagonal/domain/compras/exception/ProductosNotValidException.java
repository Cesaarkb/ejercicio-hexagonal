package com.minsait.ejercicio_hexagonal.domain.compras.exception;

public class ProductosNotValidException extends RuntimeException{

    public ProductosNotValidException(){
        super("Debe de haber al menos un producto");
    }

}

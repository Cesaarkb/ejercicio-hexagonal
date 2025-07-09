package com.minsait.ejercicio_hexagonal.domain.compras.exception;

public class ClienteNotValidException extends RuntimeException{

    public ClienteNotValidException(){
        super("Cliente debe ser valido");
    }
}

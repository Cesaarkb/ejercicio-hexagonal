package com.minsait.ejercicio_hexagonal.application.clientes.exception;

public class ClienteNotFoundException extends RuntimeException{

    public ClienteNotFoundException(Long id){
        super("Cliente con Id: " + " No encontrado");
    }

}

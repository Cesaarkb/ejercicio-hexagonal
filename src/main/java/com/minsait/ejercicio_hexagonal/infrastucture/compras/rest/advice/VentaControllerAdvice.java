package com.minsait.ejercicio_hexagonal.infrastucture.compras.rest.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.minsait.ejercicio_hexagonal.domain.compras.exception.ClienteNotValidException;
import com.minsait.ejercicio_hexagonal.domain.compras.exception.ProductosNotValidException;

@ControllerAdvice
public class VentaControllerAdvice {

    @ExceptionHandler(ClienteNotValidException.class)
    public ResponseEntity<String> handleClienteNotFound(ClienteNotValidException ex){
        return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.BAD_REQUEST);

}

   @ExceptionHandler(ProductosNotValidException.class)
    public ResponseEntity<String> handleProductosNotFound(ProductosNotValidException ex){
        return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.BAD_REQUEST);

}

   @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> NotValidVenta(MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->{
            errors.put(error.getField(), error.getDefaultMessage());
        });

        return ResponseEntity.badRequest().body(errors);
    }
}

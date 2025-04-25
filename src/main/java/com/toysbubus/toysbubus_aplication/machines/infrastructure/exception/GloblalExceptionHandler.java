package com.toysbubus.toysbubus_aplication.machines.infrastructure.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloblalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        // 4. Extrae todos los errores de validación
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            // 5. Agrega cada error al mapa (campo -> mensaje)
            errors.put(error.getField(), error.getDefaultMessage());
        });

        return errors; // Ej: { "name": "El nombre es obligatorio" }
    }

}

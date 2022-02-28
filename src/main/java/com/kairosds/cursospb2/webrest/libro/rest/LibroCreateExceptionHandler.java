package com.kairosds.cursospb2.webrest.libro.rest;

import com.kairosds.cursospb2.webrest.common.ApiError;
import com.kairosds.cursospb2.webrest.libro.rest.exceptions.LibroCreateException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LibroCreateExceptionHandler {

    @ExceptionHandler(LibroCreateException.class)
    public ResponseEntity<ApiError> createApiError(LibroCreateException exception){

        final var apiError = ApiError.builder()
                .code(400)
                .message(exception.getMessage())
                .build();
        return ResponseEntity.status(400).body(apiError);

    }
}

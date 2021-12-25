package com.julucin.hroauth.exceptions.handler;

import com.julucin.hroauth.exceptions.KeyDoesNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {

    @ExceptionHandler(value = KeyDoesNotExistException.class)
    public ResponseEntity<ExceptionHandlerResponse> handle(KeyDoesNotExistException exception){
        return ResponseEntity.badRequest().body(ExceptionHandlerResponse.of(exception));
    }

}

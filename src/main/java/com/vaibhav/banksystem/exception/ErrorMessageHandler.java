package com.vaibhav.banksystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorMessageHandler {
  @ExceptionHandler(AccountNotFound.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseEntity<String> exceptionMethod(AccountNotFound accountNotFound){
    return new ResponseEntity<>(accountNotFound.getMessage() , HttpStatus.NOT_FOUND);
  }

}

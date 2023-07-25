package com.vaibhav.banksystem.exception.handler;

import com.vaibhav.banksystem.exception.AccountNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ErrorMessageHandler {


  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<Map<String , String>> validationException(MethodArgumentNotValidException methodArgumentNotValidException){
    Map<String , String> errorMap = new HashMap<>();
    methodArgumentNotValidException.getBindingResult().getFieldErrors().forEach(fieldError -> errorMap.put(fieldError.getField() , fieldError.getDefaultMessage()));
    return new ResponseEntity<>(errorMap , HttpStatus.BAD_REQUEST);
  }


//  @ExceptionHandler(AccountNotFound.class)
//  public ResponseEntity<String> exceptionMethod(AccountNotFound accountNotFound){
//    return new ResponseEntity<>(accountNotFound.getMessage() , HttpStatus.NOT_FOUND);
//  }

  @ExceptionHandler(AccountNotFound.class)
  public ResponseEntity<Map<String , String>> exceptionMethod(AccountNotFound accountNotFound){
    Map<String , String> errorMapAccount = new HashMap<>();
    errorMapAccount.put("Error" , accountNotFound.getMessage());
    return new ResponseEntity<>(errorMapAccount, HttpStatus.NOT_FOUND);
  }


}

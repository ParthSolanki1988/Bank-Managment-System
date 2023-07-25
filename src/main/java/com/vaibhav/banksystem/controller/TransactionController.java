package com.vaibhav.banksystem.controller;

import com.vaibhav.banksystem.dto.*;
import com.vaibhav.banksystem.service.AccountService;
import com.vaibhav.banksystem.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/transactions")
public class TransactionController {

  @Autowired
  TransactionService transactionService;
  @PostMapping
  public ResponseEntity<TransactionResponseDto> createAccount(@Valid @RequestBody TransactionRequestDto transactionRequestDto){
    TransactionResponseDto transactionResponseDto = transactionService.createTransaction(transactionRequestDto);
    return new ResponseEntity<>( transactionResponseDto, HttpStatus.CREATED);
  }

}

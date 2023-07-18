package com.vaibhav.banksystem.controller;

import com.vaibhav.banksystem.dto.account.AccountRequestDto;
import com.vaibhav.banksystem.dto.account.AccountResponseDto;
import com.vaibhav.banksystem.dto.account.AccountDto;
import com.vaibhav.banksystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/accounts")
public class AccountController {

  @Autowired
  AccountService accountService;
  @PostMapping
  public ResponseEntity<AccountResponseDto> createAccount(@RequestBody AccountRequestDto accountRequestDto){
    AccountResponseDto accountResponseDto = accountService.createAccount(accountRequestDto);
    return new ResponseEntity<>( accountResponseDto, HttpStatus.CREATED);
  }


  @GetMapping
  public ResponseEntity<List<AccountDto>> getAllAccount(){
    List<AccountDto> allAccount = accountService.getAllAccount();
    return new ResponseEntity<>(allAccount , HttpStatus.FOUND);
  }
}

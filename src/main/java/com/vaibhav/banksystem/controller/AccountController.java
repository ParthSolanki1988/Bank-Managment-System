package com.vaibhav.banksystem.controller;

import com.vaibhav.banksystem.dto.AccountRequestDto;
import com.vaibhav.banksystem.dto.AccountResponseDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.AccountDto;
import com.vaibhav.banksystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @DeleteMapping("{id}")
  public ResponseEntity<AccountDto> deleteAccount(@PathVariable("id") Long id , Account account){
    AccountDto accountDto = accountService.deleteAccountById(id, account);
    return new ResponseEntity<>(accountDto , HttpStatus.OK);
  }
}

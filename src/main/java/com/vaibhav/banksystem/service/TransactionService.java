package com.vaibhav.banksystem.service;

import com.vaibhav.banksystem.dto.TransactionRequestDto;
import com.vaibhav.banksystem.dto.TransactionResponseDto;
import com.vaibhav.banksystem.entity.Account;

public interface TransactionService {


  TransactionResponseDto createTransaction(TransactionRequestDto transactionRequestDto);
}

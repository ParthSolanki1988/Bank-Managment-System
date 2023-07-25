package com.vaibhav.banksystem.service.impl;

import com.vaibhav.banksystem.dto.TransactionRequestDto;
import com.vaibhav.banksystem.dto.TransactionResponseDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.Transaction;
import com.vaibhav.banksystem.entity.TransactionType;
import com.vaibhav.banksystem.mapper.TransactionMapper;
import com.vaibhav.banksystem.repository.AccountRepository;
import com.vaibhav.banksystem.repository.TransactionRepository;
import com.vaibhav.banksystem.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

  @Autowired
  TransactionMapper transactionMapper;

  @Autowired
  TransactionRepository transactionRepository;

  @Autowired
  AccountRepository accountRepository;

  @Override
  public TransactionResponseDto createTransaction(TransactionRequestDto transactionRequestDto) {

    Account existingAccount = accountRepository.findByAccountNumber(transactionRequestDto.getAccountNumber());

    double updatedBalance;
    log.info("transaction method start ");

    if (transactionRequestDto.getAccountNumber().equals(existingAccount.getAccountNumber())){
      log.info("transaction start");
      double currentBalance = existingAccount.getCurrentBalance();
      Double txAmount = transactionRequestDto.getAmount();
      if (currentBalance > 0){
        if (transactionRequestDto.getType().equals(TransactionType.CREDIT)){
          updatedBalance = currentBalance + txAmount;
          existingAccount.setCurrentBalance(updatedBalance);
          log.info("CREDIT amount using transaction");

        }else {
          updatedBalance = currentBalance - transactionRequestDto.getAmount();
          existingAccount.setCurrentBalance(updatedBalance);
          log.info("DEBIT amount using transaction");
        }
      }
    }
    Account saveAccount = accountRepository.save(existingAccount);
    log.info("Update account");
    Transaction transaction = transactionMapper.transactionRequestToTransaction(transactionRequestDto);
    transaction.setAccount(saveAccount);
    transactionRepository.save(transaction);
    TransactionResponseDto transactionResponseDto = transactionMapper.transactionToTransactionResponseDto(transaction);

    return transactionResponseDto;
  }
}


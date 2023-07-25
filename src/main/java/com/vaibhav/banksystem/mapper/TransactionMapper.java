package com.vaibhav.banksystem.mapper;

import com.vaibhav.banksystem.dto.TransactionRequestDto;
import com.vaibhav.banksystem.dto.TransactionResponseDto;
import com.vaibhav.banksystem.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

  @Mapping(target = "account.accountNumber"  , source = "accountNumber")
  Transaction transactionRequestToTransaction(TransactionRequestDto transactionRequestDto);

  @Mapping(target = "accountNumber"  , source = "account.accountNumber")
  TransactionRequestDto transactionToTransactionRequestDto(Transaction transaction);

  @Mapping(target = "accountNumber"  , source = "account.accountNumber")
  TransactionResponseDto transactionToTransactionResponseDto(Transaction transaction);
}

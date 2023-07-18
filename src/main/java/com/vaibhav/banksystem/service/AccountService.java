package com.vaibhav.banksystem.service;

import com.vaibhav.banksystem.dto.account.AccountRequestDto;
import com.vaibhav.banksystem.dto.account.AccountResponseDto;
import com.vaibhav.banksystem.dto.account.AccountDto;

import java.util.List;

public interface AccountService {

  AccountResponseDto createAccount(AccountRequestDto accountRequestDto);

  List<AccountDto> getAllAccount();
}

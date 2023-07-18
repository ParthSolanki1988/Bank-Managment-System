package com.vaibhav.banksystem.service;

import com.vaibhav.banksystem.dto.AccountRequestDto;
import com.vaibhav.banksystem.dto.AccountResponseDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.AccountDto;

import java.util.List;

public interface AccountService {

  AccountResponseDto createAccount(AccountRequestDto accountRequestDto);

  List<Account> getAllAccount();

  Account getById(int id);

  AccountDto deleteAccountById(Long id , Account account);
}

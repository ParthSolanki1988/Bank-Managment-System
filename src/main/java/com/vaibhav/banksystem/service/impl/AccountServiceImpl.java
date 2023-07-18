package com.vaibhav.banksystem.service.impl;

import com.vaibhav.banksystem.dto.account.AccountRequestDto;
import com.vaibhav.banksystem.dto.account.AccountResponseDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.dto.account.AccountDto;
import com.vaibhav.banksystem.exception.AccountNotFound;
import com.vaibhav.banksystem.mapper.accountmapper.AccountMapper;
import com.vaibhav.banksystem.repository.AccountRepository;
import com.vaibhav.banksystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  AccountRepository accountRepository;

  @Autowired
  AccountMapper accountMapper;
  @Override
  public AccountResponseDto createAccount(AccountRequestDto accountRequestDto) {
      Account account = accountMapper.accountReqestDtoToAccount(accountRequestDto);
      accountRepository.save(account);
      return accountMapper.accountToAccountResponseDto(account);
  }

  @Override
  public List<AccountDto> getAllAccount() {
    List<Account> accountList = accountRepository.findAll();

    List<AccountDto> accountDtos = accountMapper.listOfAccountToListOfAccountDto(accountList);

    return accountDtos;
  }
}

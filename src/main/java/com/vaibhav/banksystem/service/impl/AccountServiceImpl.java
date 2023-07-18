package com.vaibhav.banksystem.service.impl;

import com.vaibhav.banksystem.dto.AccountRequestDto;
import com.vaibhav.banksystem.dto.AccountResponseDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.AccountDto;
import com.vaibhav.banksystem.exception.AccountNotFound;
import com.vaibhav.banksystem.mapstruct.MapStructMapping;
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
  MapStructMapping mapStructMapping;
  @Override
  public AccountResponseDto createAccount(AccountRequestDto accountRequestDto) {
    if (accountRequestDto != null){
      Account account = mapStructMapping.accountReqestDtoToAccount(accountRequestDto);
      accountRepository.save(account);
      return mapStructMapping.accountToAccountResponseDto(account);
    }else {
      throw new AccountNotFound("Account Not Found");
    }
  }

  @Override
  public List<Account> getAllAccount() {
    return null;
  }

  @Override
  public Account getById(int id) {
    return null;
  }

  @Override
  public AccountDto deleteAccountById(Long id , Account account) {
    Optional<Account> optionalAccount = accountRepository.findById(id);
    account = optionalAccount.get();

    if (optionalAccount.isPresent()){
      accountRepository.deleteById(id);
      return mapStructMapping.accountToAccountDto(account);
    }else {
      throw new AccountNotFound("Account Not Found");
    }
  }
}

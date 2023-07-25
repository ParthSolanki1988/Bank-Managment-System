package com.vaibhav.banksystem.service.impl;

import com.vaibhav.banksystem.dto.AccountDto;
import com.vaibhav.banksystem.dto.AccountRequestDto;
import com.vaibhav.banksystem.dto.AccountResponseDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.mapper.AccountMapper;
import com.vaibhav.banksystem.repository.AccountRepository;
import com.vaibhav.banksystem.service.AccountService;
import com.vaibhav.banksystem.exception.AccountNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  AccountRepository accountRepository;

  @Autowired
  AccountMapper accountMapper;
  @Override
  public AccountResponseDto createAccount(AccountRequestDto accountRequestDto) {
      Account account = accountMapper.accountReqestDtoToAccount(accountRequestDto);

      //set account UUID number
      String accountNumber = UUID.randomUUID().toString();
      account.setAccountNumber(accountNumber);

      accountRepository.save(account);
      return accountMapper.accountToAccountResponseDto(account);
  }

  @Override
  public List<AccountDto> getAllAccount() {
    List<Account> accountList = accountRepository.findAll();

    List<AccountDto> accountDtos = accountMapper.listOfAccountToListOfAccountDto(accountList);

    return accountDtos;
  }

  @Override
  public AccountDto getAccountByUserId(Long id) {
    Account accountByUserId = accountRepository.findByUserId(id);
    AccountDto accountDto = accountMapper.accountToAccountDto(accountByUserId);
    return accountDto;
  }

  @Override
  public void deleteById(Long id) {
    Optional<Account> optionalAccount = accountRepository.findById(id);
    if (optionalAccount.isPresent()){
      accountRepository.deleteById(id);
    }else {
      throw new AccountNotFound("Account not found");
    }
  }
}

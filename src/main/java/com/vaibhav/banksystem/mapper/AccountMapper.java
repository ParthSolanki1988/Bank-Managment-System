package com.vaibhav.banksystem.mapper;

import com.vaibhav.banksystem.dto.AccountRequestDto;
import com.vaibhav.banksystem.dto.AccountResponseDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.dto.AccountDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

  Account accountReqestDtoToAccount(AccountRequestDto accountRequestDto);

  AccountResponseDto accountToAccountResponseDto(Account account);

  Account accountDtoToAccount(AccountDto accountDto);

  AccountDto accountToAccountDto(Account account);

  List<AccountDto> listOfAccountToListOfAccountDto(List<Account> accountList);


}

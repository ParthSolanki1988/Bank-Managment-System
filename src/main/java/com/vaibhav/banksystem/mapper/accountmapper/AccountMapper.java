package com.vaibhav.banksystem.mapper.accountmapper;

import com.vaibhav.banksystem.dto.account.AccountRequestDto;
import com.vaibhav.banksystem.dto.account.AccountResponseDto;
import com.vaibhav.banksystem.dto.user.UserDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.dto.account.AccountDto;
import com.vaibhav.banksystem.entity.User;
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

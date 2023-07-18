package com.vaibhav.banksystem.mapstruct;

import com.vaibhav.banksystem.dto.AccountRequestDto;
import com.vaibhav.banksystem.dto.AccountResponseDto;
import com.vaibhav.banksystem.dto.UserDto;
import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.AccountDto;
import com.vaibhav.banksystem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapping {

  Account accountReqestDtoToAccount(AccountRequestDto accountRequestDto);

  AccountResponseDto accountToAccountResponseDto(Account account);

  User userDtoToUser(UserDto userDto);

  UserDto userToUserDto(User user);

  Account accountDtoToAccount(AccountDto accountDto);

  AccountDto accountToAccountDto(Account account);


}

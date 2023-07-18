package com.vaibhav.banksystem.dto.account;

import com.vaibhav.banksystem.dto.user.UserDto;
import com.vaibhav.banksystem.entity.AccountType;
import lombok.Data;

import java.util.UUID;

@Data
public class AccountRequestDto {
  private UUID accountNumber;
  private double currentBalance;
  private AccountType type;
  private UserDto user;

}

package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.AccountType;
import lombok.Data;

import java.util.UUID;

@Data
public class AccountRequestDto {
  private String accountNumber;
  private double currentBalance;
  private AccountType type;
  private UserDto user;

}

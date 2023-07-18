package com.vaibhav.banksystem.dto.account;

import com.vaibhav.banksystem.dto.user.UserDto;
import lombok.Data;

import java.util.UUID;

@Data
public class AccountResponseDto {
  private UUID accountNumber;
  private double currentBalance;
  private UserDto user;
}

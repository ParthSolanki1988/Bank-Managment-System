package com.vaibhav.banksystem.dto;

import lombok.Data;

@Data
public class AccountResponseDto {
  private Long id;
  private String accountNumber;
  private double currentBalance;
  private UserDto user;
}

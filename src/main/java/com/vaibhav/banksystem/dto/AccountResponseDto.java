package com.vaibhav.banksystem.dto;

import lombok.Data;

import java.util.List;

@Data
public class AccountResponseDto {
  private Long id;
  private Long accountNumber;
  private double currentBalance;
  private UserDto user;
}

package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.AccountType;
import com.vaibhav.banksystem.entity.Transaction;
import com.vaibhav.banksystem.entity.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AccountRequestDto {
  private Long accountNumber;
  private double currentBalance;
  private AccountType type;
  private UserDto user;

}

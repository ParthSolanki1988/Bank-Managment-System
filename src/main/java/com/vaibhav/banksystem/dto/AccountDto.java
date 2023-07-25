package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.AccountType;
import lombok.Data;

/**
 * DTO for {@link Account}
 */
@Data
public class AccountDto {
  Long id;
  String accountNumber;
  double currentBalance;
  AccountType type;
}
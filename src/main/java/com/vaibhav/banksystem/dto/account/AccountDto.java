package com.vaibhav.banksystem.dto.account;

import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.AccountType;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link Account}
 */
@Data
public class AccountDto {
  UUID accountNumber;
  double currentBalance;
  AccountType type;
}
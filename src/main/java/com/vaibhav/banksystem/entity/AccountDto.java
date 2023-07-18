package com.vaibhav.banksystem.entity;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Account}
 */
@Data
public class AccountDto {
  Long id;
  Long accountNumber;
  double currentBalance;
  AccountType type;
}
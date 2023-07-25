package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.Account;
import com.vaibhav.banksystem.entity.Transaction;
import com.vaibhav.banksystem.entity.TransactionType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

/**
 * DTO for {@link Transaction}
 */
@Data
public class TransactionRequestDto extends TransactionDto{

  @NotNull
  String accountNumber;

}
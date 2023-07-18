package com.vaibhav.banksystem.dto.transaction;

import com.vaibhav.banksystem.entity.TransactionType;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.vaibhav.banksystem.entity.Transaction}
 */
@Data
public class TransactionDto {
  LocalDate transactionDate;
  Double amount;
  TransactionType type;
}
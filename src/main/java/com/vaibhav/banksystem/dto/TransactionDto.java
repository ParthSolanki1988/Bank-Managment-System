package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.TransactionType;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.vaibhav.banksystem.entity.Transaction}
 */
@Data
public class TransactionDto {

  private Instant transactionDate = Instant.now();
  Double amount;
  TransactionType type;
}
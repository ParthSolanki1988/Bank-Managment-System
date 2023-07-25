package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.Transaction;
import com.vaibhav.banksystem.entity.TransactionType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.ZoneId;

/**
 * DTO for {@link Transaction}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {

  private Instant transactionDate = Instant.now();

  @Min(0)
  @Max(50000)
  @NotNull
  private Double amount;

  @NotNull
  private TransactionType type;
}
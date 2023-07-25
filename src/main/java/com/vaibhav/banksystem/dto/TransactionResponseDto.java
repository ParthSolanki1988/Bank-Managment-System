package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link Transaction}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponseDto extends TransactionDto{
  String accountNumber;

}
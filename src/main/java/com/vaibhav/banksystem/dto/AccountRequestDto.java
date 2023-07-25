package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.AccountType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AccountRequestDto {

  @Min(1000)
  @Max(10000000)
  @NotNull
  private double currentBalance;

  @NotNull(message = "Enter Valid Account Type")
  private AccountType type;
  @Valid
  private UserDto user;

}

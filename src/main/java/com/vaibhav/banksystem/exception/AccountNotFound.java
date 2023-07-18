package com.vaibhav.banksystem.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AccountNotFound extends RuntimeException {

  public AccountNotFound(String message) {
    super(message);
  }
}

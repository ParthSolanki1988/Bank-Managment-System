package com.vaibhav.banksystem.dto;

import com.vaibhav.banksystem.entity.Account;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
  private String firstName;
  private String lastName;
  private LocalDate birthDate;
  private String panCardNumber;

}
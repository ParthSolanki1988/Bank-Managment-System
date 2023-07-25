package com.vaibhav.banksystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
//  @NotBlank(message = "First name is mandatory.")
  @NotNull(message = "First Name not null")
  private String firstName;
  @NotNull(message = "First Name not null")
  private String lastName;
  private LocalDate birthDate;
  @NotNull(message = "PanCardNumber Number is Mandatory")
  private String panCardNumber;

}

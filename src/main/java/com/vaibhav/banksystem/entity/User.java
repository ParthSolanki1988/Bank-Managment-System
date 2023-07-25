package com.vaibhav.banksystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "first_name")

  private String firstName;

  @Column(name = "last_name")
  @NotBlank(message = "Last name is mandatory.")
  private String lastName;

  @Column(name = "birth_date")
  private LocalDate birthDate;

  @Column(name = "pan_card_number")
  @NotNull
  private String panCardNumber;

  @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
  private List<Account> accounts;
}

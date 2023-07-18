package com.vaibhav.banksystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "account")
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "account_number")
  private Long accountNumber;

  @Column(name = "current_balance")
  private double currentBalance;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private AccountType type;

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany(cascade = {CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE}, mappedBy = "account")
  private List<Transaction> transactions = new ArrayList<>();
}
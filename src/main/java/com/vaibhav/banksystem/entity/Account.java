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
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "account_number")
  private String accountNumber;

  @Column(name = "current_balance")
  private double currentBalance;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private AccountType type;

  /**
   * when we get List of Account , it's also give list of user
   * thats why add lazy
   * because of fk_user_id in account table
   */
  @ManyToOne(cascade = CascadeType.PERSIST , fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany(mappedBy = "account")
  private List<Transaction> transactions = new ArrayList<>();



}
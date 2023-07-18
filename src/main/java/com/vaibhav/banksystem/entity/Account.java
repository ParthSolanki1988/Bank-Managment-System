package com.vaibhav.banksystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "account")
public class Account {

  @Id
  @Column(name = "account_number")
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID accountNumber;

  @Column(name = "current_balance")
  private double currentBalance;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private AccountType type;

  /**
   * when we get List of Account , it's also give list of user
   * thats why add lazy
   */
  @ManyToOne(cascade = CascadeType.PERSIST , fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany(cascade = {CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE}, mappedBy = "account")
  private List<Transaction> transactions = new ArrayList<>();
}
package com.vaibhav.banksystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "transaction")
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "date")
  private LocalDate transactionDate;

  @Column(name = "amount")
  private Double amount;

  @Column(name = "type")
  @Enumerated(EnumType.STRING)
  private TransactionType type;


  @ManyToOne
  @JoinColumn(name = "account_id")
  private Account account;
}

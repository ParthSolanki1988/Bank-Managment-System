package com.vaibhav.banksystem.repository;

import com.vaibhav.banksystem.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
  Account findByUserId(Long id);

  Account findByAccountNumber(String accountNumber);
}
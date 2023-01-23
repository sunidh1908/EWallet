package com.example.services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

    Transaction findByTransactionId(String transactionId);
}

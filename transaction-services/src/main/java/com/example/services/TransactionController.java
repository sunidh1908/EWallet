package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/create")
    public void createTransaction(@RequestBody() TransactionRequest transactionRequest){
        transactionService.createTransaction(transactionRequest);
    }
}

package com.example.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Integer> {
//    @Modifying
//    @Query(value="UPDATE Wallet w set w.amount = w.amount + :amount where w.userName = :userName",nativeQuery = true)
//    int updateWallet(String userName,int amount);

    Wallet findByUserName(String userName);
}

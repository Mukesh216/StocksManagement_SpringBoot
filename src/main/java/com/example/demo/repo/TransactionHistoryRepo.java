package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.TransactionHistory;

@Repository
public interface TransactionHistoryRepo extends JpaRepository<TransactionHistory, Integer> {

}

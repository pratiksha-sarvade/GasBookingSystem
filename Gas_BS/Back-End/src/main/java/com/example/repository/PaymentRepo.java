package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Integer> 
{
    
    // Example of custom query method
    // Add custom queries as per your requirements
}


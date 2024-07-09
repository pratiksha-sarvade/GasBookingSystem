package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Delivery;


public interface DeliveryRepo extends JpaRepository<Delivery, Integer>{

}
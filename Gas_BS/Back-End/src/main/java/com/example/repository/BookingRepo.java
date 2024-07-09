package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.entity.Booking;


public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
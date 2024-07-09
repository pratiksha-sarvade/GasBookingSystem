package com.example.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.example.entity.Booking;

import com.example.entity.Delivery;

import com.example.entity.Payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customers")
public class Customer 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private int cust_id;

    @Column(name = "cust_name")
    private String cust_Name;

    @Column(name = "cust_phone_no")
    private String cust_Phone;

    @Column(name = "cust_email_id")
    private String cust_Email;
    
    @Column(name = "cust_address")
    private String cust_address;

    @Column(name = "cust_password")
    private String cust_password;

    @OneToMany() //mappedBy = "customer"
    private List<Booking> booking;

    @OneToMany() //mappedBy = "customer"
    private List<Payment> payment;

    @OneToMany() //mappedBy = "customer"
    private List<Delivery> delivery;

}
package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "pay_id")
	    private int pay_id;
	    
	    
		@Column(name="booking_id")
		private int booking_id;

	    
	    @Column(name = "pay_price")
	    private double pay_price;

	    
		@Column(name="pay_date",length=20)
		private LocalDate pay_date;
	    
		@Column(name = "cust_id")
	    private int cust_id;
	}


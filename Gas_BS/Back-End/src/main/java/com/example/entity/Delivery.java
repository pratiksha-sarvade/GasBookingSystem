package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery")
public class Delivery {

		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name = "delivery_id")
		    private int delivery_Id;
		   
		    
		    @Column(name = "cust_address")
		    private double cust_address;

		    
			@Column(name="delivery_Date",length=20)
			private LocalDate delivery_Date;
		    
			@Column(name = "cust_id")
		    private int cust_id;
			
		
		}
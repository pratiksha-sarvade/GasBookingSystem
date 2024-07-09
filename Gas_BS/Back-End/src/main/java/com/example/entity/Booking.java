package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.entity.Customer;
import com.example.entity.Gas;

public class Booking {

	@Entity
	@Table(name = "Booking")
	public class Order 
	{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "booking_id")
	    private int booking_Id;

	    //@Column(name = "booking_title")
	    //private String booking_title;

	    @Column(name = "booking_date")
	    private int date;

	    // Establishing many-to-one relationship with Customers entity
	    
	    @ManyToOne
	    @JoinColumn(name = "cust_id")
	    private Customer customer;

	    // Establishing many-to-one relationship with Items entity
	    @ManyToOne
	    @JoinColumn(name = "gas_id")
	    private Gas gas;
	}
}

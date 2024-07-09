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

@Entity
@Table(name = "Gas")
public class Gas {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "gas_id")
	    private int gas_Id;
	    
	    
		@Column(name = "gas_name")
	    private String gas_name;

	    @Column(name = "price")
	    private double price;
	    
	   // @Column(name = "booking_count")
	   // private int booking_Count;
	    
	    // Establishing one-to-many relationship with Order entity
	    @OneToMany() //mappedBy = "gas"
	    private List<Booking> booking;
	}

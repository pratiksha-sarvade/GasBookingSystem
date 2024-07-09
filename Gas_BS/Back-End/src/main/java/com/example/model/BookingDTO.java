package com.example.model;

import javax.validation.constraints.NotNull;

import com.example.entity.Customer;

public class BookingDTO {

private Integer booking_id;
	
	@NotNull
	private String booking_date;
	
	private Customer customer;
}

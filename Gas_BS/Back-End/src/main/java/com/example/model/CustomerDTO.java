package com.example.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.entity.Booking;
import com.example.entity.Delivery;
import com.example.entity.Payment;

import lombok.Data;


@Data
public class CustomerDTO {

private Integer cust_id;
	
	@NotNull
	@Size(min = 2, max = 40, message = "Customer name should have minimum 2 and maximum 40 characters")
	private String cust_Name;
	
	@NotNull
	@Size(min = 2, max = 40, message = "Customer phone should have minimum 2 and maximum 40 characters")
	private String cust_Phone_no;
	
	@NotNull
	@Size(max = 255, message = "Email address must not exceed 255 characters")
	private String cust_email_id;
	
	@NotNull
	@Size(max = 255, message = "Address must not exceed 255 characters")
	private String cust_address;
	
	@NotNull
	@Size(max = 255, message = "Password must not exceed 255 characters")
	private String cust_Password;
	
	private List<BookingDTO> booking;
	private List<Delivery> delivery;
	private List<Payment> payment;
	
}


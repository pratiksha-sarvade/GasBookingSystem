package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Booking;
import com.example.entity.Payment;
import com.example.service.CustomerService;


	@RestController // Mark this class as a Spring REST controller
	@RequestMapping("/customer") // Base URL mapping for the controller
	@CrossOrigin(origins = "http://localhost:8086")
	public class CustomerController 
	{

	    @Autowired // Inject the CustomersService dependency
	    private CustomerService customersService;

	    // For placing orders

	    @PostMapping("/placeBooking") // Handle POST requests for placing orders
	    public String placeBooking(@RequestBody Booking booking) // Define a method for placing an order
	    {
	        customersService.placeBooking(booking); // call to service
	        return "Booking placed successfully"; 
	    }

	    // For canceling orders

	    @DeleteMapping("/cancelBooking/{booking_Id}") // Handle DELETE requests for canceling orders
	    public String cancelOrder(@PathVariable int booking_id)// Define a method for canceling an order
	    { 
	        customersService.cancelBooking(booking_id); // call to service
	        return "Booking cancelled successfully"; 
	    }

	    // For providing feedback

	    @PostMapping("/providePayment") // Handle POST requests for providing feedback
	    public String providePayment(@RequestBody Payment payment)  // Define a method for providing feedback
	    {
	        customersService.providePayment(payment); //  call to service
	        return "Payment Done successfully"; 
	    }
	}



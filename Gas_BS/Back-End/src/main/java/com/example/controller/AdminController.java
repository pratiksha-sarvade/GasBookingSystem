package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Booking;
import com.example.entity.Customer;
import com.example.entity.Delivery;
import com.example.entity.Gas;
import com.example.entity.Payment;
import com.example.service.AdminService;

@RestController // Mark this class as a Spring REST controller
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8086")
public class AdminController {



	    @Autowired // Inject the AdminService dependency
	    AdminService adminService;

	    // For managing menu items

	    @PostMapping("/addGas") // Handle POST requests for adding a menu item
	    public String addGas(@RequestBody Gas gas) 
	    {
	        adminService.addGas(gas); // call to service
	        return "Gas added successfully"; 
	    }

	    @PutMapping("/updateGas") // Handle PUT requests for updating a menu item
	    public String updateGas(@RequestBody Gas gas) 
	    {
	        adminService.updateGas(gas); // call to service
	        return "Gas updated successfully"; 
	    }

	    @DeleteMapping("/deleteGas") // Handle DELETE requests for deleting a menu item
	    public String deleteGas(@RequestBody Gas gas) 
	    {
	        adminService.deleteGas(gas); //call to service
	        return "Gas deleted successfully"; 
	    }

	    @GetMapping("/retrieveGas/{gas_id}") // Handle GET requests for retrieving a menu item by ID
	    public Gas retrieveGas(@PathVariable int gas_id) 
	    {
	        return adminService.retrieveGas(gas_id); // call to service and return result
	    }

	    // For managing staff

	    @PostMapping("/addCustomer") // Handle POST requests for adding staff
	    public String addCustomer(@RequestBody Customer customer) 
	    {
	        adminService.addCustomer(customer); // call to service
	        return "Customer added successfully"; 
	    }

	    @PutMapping("/updateCustomer") // Handle PUT requests for updating staff
	    public String updateCustomer(@RequestBody Customer customer) 
	    {
	        adminService.updateCustomer(customer); // call to service
	        return "Customer updated successfully"; 
	    }

	    @DeleteMapping("/deleteCustomer") // Handle DELETE requests for deleting staff
	    public String deleteCustomer(@RequestBody Customer customer) 
	    {
	        adminService.deleteCustomer(customer); // call to service
	        return "Customer deleted successfully"; 
	    }

	    @GetMapping("/retrieveCustomer/{cust_id}") // Handle GET requests for retrieving staff by ID
	    public Customer retrieveCustomer(@PathVariable int cust_id) 
	    {
	        return adminService.retrieveCustomer(cust_id); //call to service and return result
	    }

	    // For managing tables

	    @PostMapping("/addBooking") // Handle POST requests for adding a table
	    public String addBooking(@RequestBody Booking booking) 
	    {
	        adminService.addBooking(booking); // call to service
	        return "Booking added successfully"; 
	    }

	    @PutMapping("/updateBooking") // Handle PUT requests for updating a table
	    public String updateBooking(@RequestBody Booking booking) 
	    {
	        adminService.updateBooking(booking); // call to service
	        return "Booking updated successfully"; 
	    }

	    @DeleteMapping("/deleteBooking") // Handle DELETE requests for deleting a table
	    public String deleteBooking(@RequestBody Booking booking) 
	    {
	        adminService.deleteBooking(booking); // call to service
	        return "Booking deleted successfully"; 
	    }

	    @GetMapping("/retrieveBooking/{booking_id}") // Handle GET requests for retrieving a table by ID
	    public Booking retrieveBooking(@PathVariable int booking_id) 
	    {
	        return adminService.retrieveBooking(booking_id); // call to service and return result
	    }

	    // For viewing orders and feedback

	    @GetMapping("/viewPayment") // Handle GET requests for viewing orders
	    public List<Payment> viewPayment() 
	    {
	        return adminService.viewPayment(); //call to service and return result
	    }

	    @GetMapping("/viewDelivery") // Handle GET requests for viewing feedback
	    public List<Delivery> getAllDelivery() 
	    {
	        return adminService.getAllDelivery(); //call to service and return result
	    }
	}


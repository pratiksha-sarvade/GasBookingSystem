package com.example.service;

import java.util.List;

import com.example.entity.Booking;
import com.example.entity.Customer;
import com.example.entity.Delivery;
import com.example.entity.Gas;
import com.example.entity.Payment;


public interface AdminService {

	// For managing menu Booking
    String addBooking(Booking booking);
    String updateBooking(Booking booking);
    String deleteBooking(Booking booking);
    Booking retrieveBooking(int booking_id);

    // For managing Customer
    String addCustomer(Customer customer);
    String updateCustomer(Customer customer);
    String deleteCustomer(Customer customer);
    Customer retrieveCustomer(int cust_id);

    // For managing Gas
    String addGas(Gas gas);
    String updateGas(Gas gas);
    String deleteGas(Gas gas);
    Gas retrieveGas(int gas_id);

    // For viewing Payment and Delivery
    List<Payment> viewPayment();
    List<Delivery> getAllDelivery();
}

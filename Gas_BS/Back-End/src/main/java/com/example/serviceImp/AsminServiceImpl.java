package com.example.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Booking;
import com.example.entity.Customer;
import com.example.entity.Delivery;
import com.example.entity.Gas;
import com.example.entity.Payment;
import com.example.repository.AdminRepo;
import com.example.repository.BookingRepo;
import com.example.repository.CustomerRepo;
import com.example.repository.DeliveryRepo;
import com.example.repository.GasRepo;
import com.example.repository.PaymentRepo;
import com.example.service.AdminService;

public class AsminServiceImpl implements AdminService{
	
@Autowired
private GasRepo gasRepository;

@Autowired
private CustomerRepo customerRepository;

@Autowired
private PaymentRepo paymentRepository;

@Autowired
private BookingRepo bookingRepository;

@Autowired
private DeliveryRepo deliveryRepository;

@Autowired
private AdminRepo adminRepository;


	@Override
	public String addBooking(Booking booking) {
		bookingRepository.save(booking);
        return "Booking  added successfully";
	}

	@Override
	public String updateBooking(Booking booking) {
		bookingRepository.save(booking);
        return "Booking updated successfully";
	}

	@Override
	public String deleteBooking(Booking booking) {
		 bookingRepository.delete(booking);
	        return "Booking deleted successfully";
	}

	@Override
	public Booking retrieveBooking(int booking_id) {
		 return bookingRepository.findById(booking_id).orElse(null);
	}

	@Override
	public String addCustomer(Customer customer) {
		customerRepository.save(customer);
        return "Customer added successfully";
	}

	@Override
	public String updateCustomer(Customer customer) {
		customerRepository.save(customer);
        return "Customer updated successfully";
	}

	@Override
	public String deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
        return "Customer deleted successfully";
	}

	@Override
	public Customer retrieveCustomer(int cust_id) {
		return customerRepository.findById(cust_id).orElse(null);
	}

	@Override
	public String addGas(Gas gas) {
		gasRepository.save(gas);
        return "Gas added successfully";
	}

	@Override
	public String updateGas(Gas gas) {
		gasRepository.save(gas);
        return "Gas updated successfully";
	}

	@Override
	public String deleteGas(Gas gas) {
		gasRepository.delete(gas);
        return "Gas deleted successfully";
	}

	@Override
	public Gas retrieveGas(int gas_id) {
		 return gasRepository.findById(gas_id).orElse(null);
	}

	@Override
	public List<Payment> viewPayment() {
		return paymentRepository.findAll();
	}

	@Override
	public List<Delivery> getAllDelivery() {
		return deliveryRepository.findAll();
	}

    // Additional methods for Admin management (if any)

}

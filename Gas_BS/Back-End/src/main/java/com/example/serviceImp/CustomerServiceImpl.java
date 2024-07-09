package com.example.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Booking;
import com.example.entity.Payment;
import com.example.repository.CustomerRepo;
import com.example.repository.PaymentRepo;
import com.example.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
    private CustomerRepo customersRepository;

    @Autowired
    private PaymentRepo paymentRepository;

	@Override
	public void placeBooking(Booking booking) {
		// Assuming order validation and business logic are handled before saving
		
	}

	@Override
	public void cancelBooking(int booking_id) {
		// Assuming cancellation logic involves updating order status or removing from database
		customersRepository.deleteById(booking_id);
	}

	@Override
	public void providePayment(Payment payment) {
		// Assuming validation and business logic are handled before saving
		paymentRepository.save(payment); // Save the feedback
	}

}


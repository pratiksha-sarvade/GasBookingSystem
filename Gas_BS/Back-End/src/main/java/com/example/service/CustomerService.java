package com.example.service;

import com.example.entity.Booking;
import com.example.entity.Payment;

public interface CustomerService {

	void placeBooking(Booking booking);

    void cancelBooking(int booking_id);
    
    void providePayment(Payment payment);

	//void provideDelivery(Delivery delivery);
}

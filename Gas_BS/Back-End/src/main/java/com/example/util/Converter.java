package com.example.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.entity.Admin;
import com.example.entity.Booking;
import com.example.entity.Customer;
import com.example.entity.Delivery;
import com.example.entity.Gas;
import com.example.entity.Payment;
import com.example.model.AdminDTO;
import com.example.model.BookingDTO;
import com.example.model.CustomerDTO;
import com.example.model.DeliveryDTO;
import com.example.model.GasDTO;
import com.example.model.PaymentDTO;

@Component
public class Converter {

    // Convert from AdminDTO to Admin entity
    public Admin convertToAdminEntity(AdminDTO adminDTO) 
    {
        Admin admin = new Admin();
        if (adminDTO != null) 
        {
            BeanUtils.copyProperties(adminDTO, admin);
        }
        return admin;
    }

    // Convert from Admin entity to AdminDTO
    public AdminDTO convertToAdminDTO(Admin admin) 
    {
    	AdminDTO adminDTO = new AdminDTO();
        if (admin != null) 
        {
            BeanUtils.copyProperties(admin, adminDTO);
        }
        return adminDTO;
    }

    // Convert from CustomersDto to Customers entity
    public Customer convertToCustomersEntity(CustomerDTO customersDto) 
    {
    	Customer customers = new Customer();
        if (customersDto != null) 
        {
            BeanUtils.copyProperties(customersDto, customers);
        }
        return customers;
    }

    // Convert from Customers entity to CustomersDto
    public CustomerDTO convertToCustomersDTO(Customer customers) 
    {
    	CustomerDTO customersDto = new CustomerDTO();
        if (customers != null) 
        {
            BeanUtils.copyProperties(customers, customersDto);
        }
        return customersDto;
    }

    // Convert from GasDto to Gas entity
    public Gas convertToItemsEntity(GasDTO gasDTO) 
    {
        Gas gas = new Gas();
        if (gasDTO != null) 
        {
            BeanUtils.copyProperties(gasDTO, gas);
        }
        return gas;
    }

    // Convert from Gas entity to GasDTO
    public GasDTO convertToItemsDTO(Gas gas) 
    {
    	GasDTO gasDTO = new GasDTO();
        if (gas != null) 
        {
            BeanUtils.copyProperties(gas, gasDTO);
        }
        return gasDTO;
    }

   

    // Converters for Booking
    public Booking convertToBookingEntity(BookingDTO bookingDto) 
    {
        Booking booking = new Booking();
        if (bookingDto != null) 
        {
            BeanUtils.copyProperties(bookingDto, booking);
        }
        return booking;
    }

    public BookingDTO convertToBookingDTO(Booking booking) 
    {
    	BookingDTO bookingDto = new BookingDTO();
        if (booking != null) 
        {
            BeanUtils.copyProperties(booking, bookingDto);
        }
        return bookingDto;
    }

    // Converters for Delivery
    public Delivery convertToDeliveryEntity(DeliveryDTO deliveryDTO) 
    {
    	Delivery  feedback = new Delivery ();
        if (deliveryDTO != null) 
        {
            BeanUtils.copyProperties(deliveryDTO, feedback);
        }
        return feedback;
    }

    public DeliveryDTO convertToDeliveryDTO(Delivery delivery) 
    {
    	DeliveryDTO deliveryDTO = new DeliveryDTO();
        if (delivery != null) 
        {
            BeanUtils.copyProperties(delivery, deliveryDTO);
        }
        return deliveryDTO;
    }

    

    // Converters for Payment
    public Payment convertToPaymentEntity(PaymentDTO paymentDTO) 
    {
    	Payment payment = new Payment();
        if (paymentDTO != null) 
        {
            BeanUtils.copyProperties(paymentDTO, payment);
        }
        return payment;
    }

    public PaymentDTO convertToPaymentDTO(Payment payment) 
    {
    	PaymentDTO paymentDTO = new PaymentDTO();
        if (payment != null) 
        {
            BeanUtils.copyProperties(payment, paymentDTO);
        }
        return paymentDTO;
    }
}

package com.example.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.example.entity.Booking;

import lombok.Data;


@Data
public class PaymentDTO {

	private Integer pay_id;

    @NotNull
    private Double pay_price;

    @NotNull
    private Date pay_date;

   /* @NotNull
    @Size(min = 2, max = 100, message = "Payment method should have minimum 2 and maximum 100 characters")
    private String paymentMethod;*/

    private Booking booking;  // Assuming a payment is related to an order
}

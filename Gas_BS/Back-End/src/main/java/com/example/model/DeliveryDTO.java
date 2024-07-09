package com.example.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DeliveryDTO {
	private Integer delivery_id;

	private int cust_id;
	  
	@NotNull
	@Size(max = 255, message = "Address must not exceed 255 characters")
	private String cust_address;

    @NotNull
    private LocalDate delivery_Date;


}
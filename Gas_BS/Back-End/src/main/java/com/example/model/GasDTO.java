package com.example.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.entity.Booking;

import lombok.Data;


@Data
public class GasDTO {

	private Integer gas_id;

    @NotNull
    private Double gas_price;

    @NotNull
    @Size(min = 2, max = 100, message = "Name should have minimum 2 and maximum 100 characters")
    private String gas_name;

    //@NotNull
    //private Integer booking_Count;

    private List<Booking> booking;

}

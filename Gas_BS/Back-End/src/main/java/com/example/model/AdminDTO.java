package com.example.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.entity.Customer;

import lombok.Data;




@Data
public class AdminDTO {

	private Integer admin_id;

    @NotNull
    @Size(min = 2, max = 40, message = "Admin name should have minimum 2 and maximum 40 characters")
    private String admin_name;

    @NotNull
    @Size(max = 255, message = "Password must not exceed 255 characters")
    private String Password;

    private List<Customer> customerList;  // Assuming an admin is related to multiple staff members
}
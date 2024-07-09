package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Gas;


public interface GasRepo extends JpaRepository<Gas, Integer>{

	// Example of custom query method
    //@Query("SELECT g FROM Gas g WHERE g.name = ?1")
    //Gas findByName(String name);
    
    // Add more custom query methods if needed
}

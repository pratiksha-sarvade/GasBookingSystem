package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

}


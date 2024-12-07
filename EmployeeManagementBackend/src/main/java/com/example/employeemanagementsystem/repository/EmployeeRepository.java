package com.example.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagementsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {

    
} 
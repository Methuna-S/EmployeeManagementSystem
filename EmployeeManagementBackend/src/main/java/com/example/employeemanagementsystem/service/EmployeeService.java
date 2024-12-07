package com.example.employeemanagementsystem.service;

import java.util.List;

import com.example.employeemanagementsystem.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId , EmployeeDto updatEmployeeDto);

    void deleteEmployee(Long employeeId);
}

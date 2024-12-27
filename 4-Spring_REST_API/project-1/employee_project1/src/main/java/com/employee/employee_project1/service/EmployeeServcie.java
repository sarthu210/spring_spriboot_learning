package com.employee.employee_project1.service;

import com.employee.employee_project1.entity.Employee;

import java.util.List;

public interface EmployeeServcie {
    List<Employee> findAll();

    Employee save(Employee employee);

    Employee findById(int id);

    void deleteById(int id);
}

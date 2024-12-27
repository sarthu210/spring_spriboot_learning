package com.employee.employee_project1.dao;

import com.employee.employee_project1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee save(Employee employee);

    Employee findById(int id);

    void deleteById(int id);
}

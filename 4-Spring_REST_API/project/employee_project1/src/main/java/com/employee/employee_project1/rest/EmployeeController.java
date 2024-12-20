package com.employee.employee_project1.rest;

import com.employee.employee_project1.dao.EmployeeDAO;
import com.employee.employee_project1.entity.Employee;
import com.employee.employee_project1.service.EmployeeServcie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeServcie employeeServcie;

    public EmployeeController(EmployeeServcie theEmployeeService)
    {
        this.employeeServcie = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeServcie.findAll();
    }
}

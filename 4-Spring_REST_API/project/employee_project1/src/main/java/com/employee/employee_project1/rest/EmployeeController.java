package com.employee.employee_project1.rest;

import com.employee.employee_project1.dao.EmployeeDAO;
import com.employee.employee_project1.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeDAO employeeDAO;

    public EmployeeController(EmployeeDAO theEmployeeDao)
    {
        this.employeeDAO = theEmployeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeDAO.findAll();
    }
}

package com.employee.employee_project1.service;

import com.employee.employee_project1.dao.EmployeeDAO;
import com.employee.employee_project1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImple implements EmployeeServcie{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImple(EmployeeDAO theEmployeeDAO)
    {
        this.employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}

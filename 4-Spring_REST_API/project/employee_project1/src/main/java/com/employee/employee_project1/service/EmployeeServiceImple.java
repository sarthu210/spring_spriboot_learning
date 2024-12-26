package com.employee.employee_project1.service;

import com.employee.employee_project1.dao.EmployeeDAO;
import com.employee.employee_project1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}

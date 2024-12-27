package jpa_project.project_using_jpa.services;

import jpa_project.project_using_jpa.enitiy.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);

    void deleteById(int id);
}

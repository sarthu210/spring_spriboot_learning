package com.employee.employee_project1.dao;

import com.employee.employee_project1.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeJpaImple implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeJpaImple(EntityManager theEntityManager)
    {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee" , Employee.class);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }
}

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

    @Override
    public Employee findById(int id){
        Employee getEmployee = entityManager.find(Employee.class, id);
        return getEmployee;
    }

    @Override
    public Employee save(Employee theEmployee)
    {
        Employee saveEmployee = entityManager.merge(theEmployee);
        return saveEmployee;
    }

    @Override
    public void deleteById(int id)
    {
        Employee employee = entityManager.find(Employee.class , id);
        entityManager.remove(employee);
    }
}

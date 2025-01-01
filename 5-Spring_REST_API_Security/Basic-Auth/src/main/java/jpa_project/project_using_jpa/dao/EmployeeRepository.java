package jpa_project.project_using_jpa.dao;

import jpa_project.project_using_jpa.enitiy.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

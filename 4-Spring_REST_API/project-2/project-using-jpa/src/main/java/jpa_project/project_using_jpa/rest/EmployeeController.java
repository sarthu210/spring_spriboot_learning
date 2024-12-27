package jpa_project.project_using_jpa.rest;

import jpa_project.project_using_jpa.enitiy.Employee;
import jpa_project.project_using_jpa.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService theEmployeeService;

    public EmployeeController(EmployeeService theEmployeeService)
    {
        this.theEmployeeService = theEmployeeService;
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees()
    {
        List<Employee> theEmployee = theEmployeeService.findAll();
        return theEmployee;
    }
}

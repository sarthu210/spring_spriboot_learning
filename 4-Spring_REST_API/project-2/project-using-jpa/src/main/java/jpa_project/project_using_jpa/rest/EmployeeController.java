package jpa_project.project_using_jpa.rest;

import jpa_project.project_using_jpa.enitiy.Employee;
import jpa_project.project_using_jpa.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService theEmployeeService;

    public EmployeeController(EmployeeService theEmployeeService)
    {
        this.theEmployeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return theEmployeeService.findAll();
    }

    @GetMapping("/employees/{employeesId}")
    public Employee getElementById(@PathVariable int employeesId) {
        Employee theEmploye = theEmployeeService.findById(employeesId);

        if(theEmploye == null)
        {
            throw new RuntimeException("Employee Id Not Found - " + employeesId);
        }

        return theEmploye;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee theEmployee)
    {
        theEmployee.setId(0);

        Employee dbEmployee = theEmployeeService.save(theEmployee);

        return dbEmployee;
    }

    @PostMapping("/employees/{employeesId}")
    public String removeEmployee(@PathVariable int employeesId)
    {
        Employee theEmployee = theEmployeeService.findById(employeesId);

        if(theEmployee == null)
        {
            throw new RuntimeException("Employee Id Not Found - " + employeesId);
        }

        theEmployeeService.deleteById(employeesId);

        return "Deleted " + employeesId + "SuccessFully!";
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee)
    {
        Employee dbEmployee = theEmployeeService.save(theEmployee);


        return dbEmployee;
    }
}

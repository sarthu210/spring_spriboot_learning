package jpa_project.project_using_jpa.services;

import jpa_project.project_using_jpa.dao.EmployeeRepository;
import jpa_project.project_using_jpa.enitiy.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TheEmployeeService implements EmployeeService{

    private EmployeeRepository theEmployeeRepository;

    @Autowired
    public TheEmployeeService(EmployeeRepository theEmployeeRepository)
    {
        this.theEmployeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return theEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> check = theEmployeeRepository.findById(id);

        Employee theEmploye = null;

        if(check.isPresent())
        {
            theEmploye = check.get();
        }

        return theEmploye;
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return theEmployeeRepository.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        theEmployeeRepository.deleteById(id);
    }
}

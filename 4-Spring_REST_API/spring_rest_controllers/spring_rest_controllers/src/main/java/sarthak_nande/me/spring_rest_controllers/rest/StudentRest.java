package sarthak_nande.me.spring_rest_controllers.rest;

import sarthak_nande.me.spring_rest_controllers.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRest {

    @GetMapping("/student")
    public List<Student> getStudents(){
        List<Student> listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Sarthak" , "Nande"));
        listOfStudents.add(new Student("Shraddha", "Nande"));
        listOfStudents.add(new Student("Madhav", "Kamble"));

        return listOfStudents;
    }
}

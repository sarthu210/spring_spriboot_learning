package sarthak_nande.me.spring_rest_controllers.rest;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sarthak_nande.me.spring_rest_controllers.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRest {

    private List<Student> listOfStudents;

    @PostConstruct
    public void loadStudents()
    {
        listOfStudents = new ArrayList<>();

        listOfStudents.add(new Student("Sarthak" , "Nande"));
        listOfStudents.add(new Student("Shraddha", "Nande"));
        listOfStudents.add(new Student("Madhav", "Kamble"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return listOfStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId)
    {
        if(studentId > listOfStudents.size() || studentId < 0)
        {
            throw new StudentNotFoundException("Invalid Student Id - " + studentId);
        }
        return listOfStudents.get(studentId);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorHandeling> excptionHandeler(StudentNotFoundException exc)
    {
        StudentErrorHandeling error = new StudentErrorHandeling();

        error.setMessage(exc.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
}

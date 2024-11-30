package sarthak_nande.me.spring_rest_controllers.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentErrorExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<StudentErrorHandeling> excptionHandeler(StudentNotFoundException exc)
    {
        StudentErrorHandeling error = new StudentErrorHandeling();

        error.setMessage(exc.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorHandeling> excptionHandler(Exception exc)
    {
        StudentErrorHandeling error = new StudentErrorHandeling();

        error.setMessage(exc.getMessage());
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}

package com.sarthak.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Value("${first.name}")
    public String firstName;

    @Value("${last.name}")
    public String lastName;

    @GetMapping("/full-name")
    public String fullName(){
        return "My name is " + firstName + " " + lastName;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/get")
    public String getNote() {return "Hi Sarthk!";}

    @GetMapping("/brocode")
    public String getbroCode() {return "your my brother";}
}

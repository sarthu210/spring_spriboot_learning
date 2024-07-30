package com.sarthak.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/get")
    public String getNote() {return "Hi Sarthk!";}

    @GetMapping("/brocode")
    public String getbroCode() {return "your my brother";}
}

package com.sarthaknande.springmvcpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello-world")
    public String sayHello(Model theModel)
    {
        theModel.addAttribute("thedate" , java.time.LocalDateTime.now());

        return "helloworld";
    }
}

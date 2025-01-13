package com.sarthaknande.springmvcpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FromController {

    @RequestMapping("/load-form")
    public String loadForm()
    {
        return "form";
    }

    @RequestMapping("/form-response")
    public String fromResponse()
    {
        return "response";
    }
}

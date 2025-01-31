package com.sarthaknande.springmvcpractice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DataFormController {

    @RequestMapping("/data-form")
    public String loadForm()
    {
        return "dataform";
    }

    @RequestMapping("/data-res")
    public String newDataForm(HttpServletRequest req, Model model)
    {
        String userFirstName = req.getParameter("firstName");
        String userLastName = req.getParameter("lastName");

        String result = userFirstName.toUpperCase() + " " + userLastName.toUpperCase();

        model.addAttribute("details" , result);

        return "userdetail";
    }
}

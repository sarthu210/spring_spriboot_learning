package com.sarthaknande.springmvcpractice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/data-resv")
    public String updatedDataForm(@RequestParam("firstName") String theFirstName, @RequestParam("lastName") String theLastName, Model model)
    {
        String result = theFirstName.toUpperCase() + " " + theLastName.toUpperCase();

        model.addAttribute("details" , result);

        return "userdetail";
    }
}

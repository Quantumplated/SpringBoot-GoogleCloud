package com.example.hw4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DemoController {

    @RequestMapping("/")
    @ResponseBody
    public String welcome()
    {
        return "Welcome to the GCP Assignment. Use '/username' and '/time' to begin.";
    }

    @RequestMapping("/username")
    @ResponseBody
    public String username()
    {
        return "Hi! My username is smehdi36.";
    }

    @RequestMapping("/time")
    @ResponseBody
    public String time()
    {
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date date = new Date();
        return "Current time and date: " + f.format(date);
    }

}
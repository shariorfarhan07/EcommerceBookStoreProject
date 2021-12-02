package com.example.ecommercebookstoreproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String home(){
        Date date=new Date();
        return date.toString().replace(" ","").replace(":","");
    }
}

package com.example.ecommercebookstoreproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("login")
    public String login(){
        return "";
    }

    @GetMapping("register")
    public String resgister(){
        return "";
    }

    @GetMapping("dashboard")
    public String dash(){
        return "";
    }
}

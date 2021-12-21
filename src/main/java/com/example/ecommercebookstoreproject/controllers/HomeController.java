package com.example.ecommercebookstoreproject.controllers;

import com.example.ecommercebookstoreproject.dao.Bookdao;
import com.example.ecommercebookstoreproject.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    public Bookdao bookdao;
    @GetMapping("/")
    //@ResponseBody
    public String home(Model model){
        List<Book> product1=bookdao.findTop12ByCategoryIsContaining("BEST-SELLER");
        model.addAttribute("products1",product1);
        List<Book> product2=bookdao.findTop12ByCategoryIsContaining("PROGRAMMING");
        model.addAttribute("products2",product2);
        List<Book> product3=bookdao.findTop12ByCategoryIsContaining("ENGINEERING");
        model.addAttribute("products3",product3);
        List<Book> product4=bookdao.findTop12ByCategoryIsContaining("ACADEMIC");
        model.addAttribute("products4",product4);
        List<Book> product5=bookdao.findTop12ByCategoryIsContaining("OLYMPIAD");
        model.addAttribute("products5",product5);



        return "frontend/index";
    }


    @GetMapping("printpdftobookinbd")
    public String pdftobook(){
        return "";
    }
    @GetMapping("sendmail")
    public String pdftobookmail(){
        return "";
    }

    @GetMapping("books/{category}")
    public String shopgrid(){
        return "";
    }









}

package com.example.ecommercebookstoreproject.controllers;

import com.example.ecommercebookstoreproject.dao.Bookdao;
import com.example.ecommercebookstoreproject.model.Book;
import com.example.ecommercebookstoreproject.service.bookInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class AdminController {
    @Autowired
    private Bookdao bookdao;
    @GetMapping("/postbook")
    public String postBook(){
        return "adminBookAdd";
    }
    @PostMapping("/sendnewbook")
    @ResponseBody
    public String sendnewbook(bookInput obj){
        System.out.println(obj.toString());
        Book book=obj.Createbook();
        bookdao.save(book);

        return "obj";

    }


}

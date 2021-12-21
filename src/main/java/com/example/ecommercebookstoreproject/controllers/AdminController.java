package com.example.ecommercebookstoreproject.controllers;

import com.example.ecommercebookstoreproject.dao.Bookdao;
import com.example.ecommercebookstoreproject.model.Book;
import com.example.ecommercebookstoreproject.service.bookInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private Bookdao bookdao;

    // book update delete add
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

    @PostMapping("admin/sendupdatebook/{id}")
    public String updateBook(){
        return "";
    }
    @GetMapping("admin/sendupdatebookid/{id}")
    public String sendUpdateBook(){
        return "";
    }

    @GetMapping("admin/deletebook/{id}")
    public String deleteBook(){
        return "";
    }


    @GetMapping("admin/orders")
    public String seeOrders(){
        return "";
    }
    @GetMapping("admin/booklist")
    public String seebooklist(Model model){
        List<Book> book=this.bookdao.findAll();
        model.addAttribute("books",book);
        return "admin/booklist";
    }




}

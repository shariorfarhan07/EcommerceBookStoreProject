package com.example.ecommercebookstoreproject.controllers;

import com.example.ecommercebookstoreproject.dao.Bookdao;
import com.example.ecommercebookstoreproject.model.Book;
import com.example.ecommercebookstoreproject.service.cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class OrderController {
    @Autowired
    private  Bookdao bookdao;

    @GetMapping("addtocart/{id}")
    public String addToCart(@PathVariable("id") int id, HttpServletRequest request){
        HttpSession cartSession=request.getSession();
        cart cartbox=new cart((cart) cartSession.getAttribute("cart"));
        Book book= bookdao.getById(id);
        cartbox.addItem(id,1,book);
        cartSession.setAttribute("cart",cartbox);

        // for redirecting
        String referer = request.getHeader("Referer");
        return "redirect:"+ referer;
    }
      @GetMapping("product/{id}/{number}")
    public String adjustCart(@PathVariable("id") int id,@PathVariable("number") int number, HttpServletRequest request){
          HttpSession cartSession=request.getSession();
          cart cartbox=new cart((cart) cartSession.getAttribute("cart"));
          cartbox.removeItem(id,number);

          // for redirecting
          String referer = request.getHeader("Referer");
          return "redirect:"+ referer;
    }
      @GetMapping("removefromcart/{id}/{number}")
    public String removeFormCart(@PathVariable("id") int id,@PathVariable("number") int number, HttpServletRequest request){
          HttpSession cartSession=request.getSession();
          cart cartbox=new cart((cart) cartSession.getAttribute("cart"));
          cartbox.removeItem(id,number);

          // for redirecting
          String referer = request.getHeader("Referer");
          return "redirect:"+ referer;
    }



}

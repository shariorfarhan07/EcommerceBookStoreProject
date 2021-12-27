package com.example.ecommercebookstoreproject.controllers;

import com.example.ecommercebookstoreproject.dao.Bookdao;
import com.example.ecommercebookstoreproject.dao.OrderListdao;
import com.example.ecommercebookstoreproject.dao.Ordersdao;
import com.example.ecommercebookstoreproject.model.Book;
import com.example.ecommercebookstoreproject.model.OrderList;
import com.example.ecommercebookstoreproject.model.Orders;
import com.example.ecommercebookstoreproject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private OrderListdao OrderListdao;
    private Bookdao bookdao;
    private Ordersdao ordersdao;

    // book update delete add
    @GetMapping("/postbook")
    public String postBook(){
        return "admin/addproduct";
    }



    @PostMapping("/sendnewbook")
    public String sendnewbook(bookInput obj, @RequestParam("image")MultipartFile image) throws IOException {
        //System.out.println(obj.toString());
        obj.setImage(image);
        Book book=obj.Createbook();
        bookdao.save(book);
        return "/postbook";
    }


    @PostMapping("/admin/sendupdatebook/{id}")
    public String updateBook(bookInput obj) throws IOException {
        //System.out.println(obj.toString());
        Book book=obj.Createbook();
        bookdao.save(book);
        return "/postbook";

    }
    @GetMapping("/admin/sendupdatebookid/{id}")
    public String sendUpdateBook(@PathVariable("id")int id,Model model){
        Book book =bookdao.getById(id);
        model.addAttribute("book",book);
        return "admin/booklist";
    }

    @GetMapping("/updatebook/{id}")
    public String updatebookid(@PathVariable("id")int id,Model model){
        Book book =bookdao.getById(id);
        bookInput bookform=bookInput.sendtoform(book);
        model.addAttribute("book",bookform);
        return "admin/update";
    }

    @GetMapping("/admin/deletebook/{id}")
    public String deleteBook(@PathVariable("id")int id){
       Book book=bookdao.getById(id);
       bookdao.deleteById(id);
       String imglk=book.getImage();
       Photosave.imageDelete(imglk);
       return "admin/booklist";
    }


    @GetMapping("/admin/orders")
    public String seeOrders(Model model){
        List<Orders> orderLists=ordersdao.findAll();
        model.addAttribute("orders",orderLists);
        return "admin/order";
    }

    @PostMapping("/sendorder")
    public String sendorder(Billing order, HttpServletRequest request){
        HttpSession cartSession=request.getSession();
        cart cartbox=new cart((cart) cartSession.getAttribute("cart"));
      //  Orders ordr=order.createOrder();
        Orders ord=order.createOrder(request);
        Map<Integer,Object[]> items=cartbox.getItems();
        for (Object[] value : items.values()) {
            OrderList books=new OrderList(ord.getId(),value, (Book) value[2]);
            OrderListdao.save(books);
        }
        return "/";
    }


    @GetMapping("/admin/booklist")
    public String seebooklist(Model model){
        List<Book> book=this.bookdao.findAll();
        model.addAttribute("books",book);
        return "admin/booklist";
    }

    @GetMapping("/sendbookrequest")
    public static void mail(Mail mail) {
       mail.sendMail();


    }





}

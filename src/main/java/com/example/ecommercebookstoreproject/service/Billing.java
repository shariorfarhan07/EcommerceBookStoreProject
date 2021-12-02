package com.example.ecommercebookstoreproject.service;


import com.example.ecommercebookstoreproject.dao.Bookdao;
import com.example.ecommercebookstoreproject.dao.Ordersdao;
import com.example.ecommercebookstoreproject.model.Orders;

public class Billing  {
    private Ordersdao order;
    private int id;
    private String first_name;
    private String last_name;
    private String phone;
    private String address;
    private String payment;
    private String paymentmethod;
    private String txid;
    private String submit;
    private String date;
    private String status;
    private String division;
    private String city;
    private String zip;
    private double price;

    public  boolean createOrder(){
        Orders odr=new Orders(id,first_name, last_name,phone,address,
                payment,paymentmethod,txid,submit,
                date,status,division,city,zip,price);
        order.save(odr);
        System.out.println(odr.getId());
    return true;
    }









    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPayment() {
        return payment;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public String getTxid() {
        return txid;
    }

    public String getSubmit() {
        return submit;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getDivision() {
        return division;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public double getPrice() {
        return price;
    }



}

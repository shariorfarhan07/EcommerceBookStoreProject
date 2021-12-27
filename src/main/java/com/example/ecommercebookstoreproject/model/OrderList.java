package com.example.ecommercebookstoreproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//id	order_id	item_id	item_name	item_price	qty
@Entity
public class OrderList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int order_id;
    private int item_id;
    private String item_name;
    private double item_price;
    private int qty;

    public OrderList(){

    }

    public OrderList(int id,Object []obj,Book book) {

        this.order_id = id;
        this.item_id = book.getId();
        this.item_name = book.getName();
        this.item_price = book.getPrice();
        this.qty = (int) obj[0];
    }



    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", item_id=" + item_id +
                ", item_name=" + item_name +
                ", item_price=" + item_price +
                ", qty=" + qty +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}

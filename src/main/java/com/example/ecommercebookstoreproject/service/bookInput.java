package com.example.ecommercebookstoreproject.service;

import com.example.ecommercebookstoreproject.model.Book;

import java.util.Arrays;

public class bookInput {
    private int id;
    private String name;
    private String description;
    private String author;
    private String publisher;
    private String category[];
    private int quantity;
    private String Date;
    private  double price;

    @Override
    public String toString() {
        return "bookInput{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category=" + Arrays.toString(category) +
                ", quantity=" + quantity +
                ", Date='" + Date + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getCategory() {
        return category;
    }
    public String getCategorytoString() {
        String s="";
        for (int i = 0; i < category.length; i++) {
            s+=" "+category[i];
        }
        return s;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Book Createbook(){
        Book book=new Book();
        book.setCategory(getCategorytoString());
        book.setAuthor(author);
        book.setDescription(description);
        book.setName(name);
        book.setPrice(price);
        book.setQuantity(quantity);
        book.setPublisher(publisher);



        book.setImage("Image name");





        return  book;
    }



}

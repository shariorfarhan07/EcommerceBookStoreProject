package com.example.ecommercebookstoreproject.service;

import com.example.ecommercebookstoreproject.model.Book;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    private MultipartFile image;

    public bookInput(int id, String name, String description, String author, String publisher, String[] category, int quantity, String date, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.quantity = quantity;
        Date = date;
        this.price = price;

    }


    public bookInput() {

    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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



    public String getCategorytoString() {
        String s="";
        for (int i = 0; i < category.length; i++) {
            s+=" "+category[i];
        }
        return s;
    }

    public Book Createbook() throws IOException {
        Book book=new Book();
        book.setCategory(getCategorytoString());
        book.setAuthor(author);
        book.setDescription(description);
        book.setName(name);
        book.setPrice(price);
        book.setQuantity(quantity);
        book.setPublisher(publisher);
        book.setImage(Photosave.imageSave(image));
        return  book;
    }


    public static bookInput sendtoform(Book book){
        return new bookInput(book.getId(),book.getName(), book.getDescription(),book.getAuthor(),
                book.getPublisher(), book.getCategory().split(" "), book.getQuantity(),
        book.getDate(), book.getPrice());
    }



}

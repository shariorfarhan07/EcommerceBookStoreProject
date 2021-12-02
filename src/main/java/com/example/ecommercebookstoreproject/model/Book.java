package com.example.ecommercebookstoreproject.model;
//id	name	description	author	publisher	category	image	price	slug	created_at	updated_at

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String author;
    private String publisher;
    private String category;
    private int quantity;
    private String Date;
    private  double price;

    @ManyToOne
    private Category categoryy;
    @OneToMany
    private List<Comments> comments=new ArrayList<>();

    private String image;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", Date='" + Date + '\'' +
                ", price=" + price +

                ", categoryy=" + categoryy +
                ", comments=" + comments +
                ", image='" + image + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategoryy() {
        return categoryy;
    }

    public void setCategoryy(Category categoryy) {
        this.categoryy = categoryy;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }




}

package com.example.ecommercebookstoreproject.dao;

import com.example.ecommercebookstoreproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Bookdao extends JpaRepository<Book,Integer> {
    //public List<Book> findByCategoryIsContaining(String category);
    public List<Book> findTop12ByCategoryIsContaining(String category);

}

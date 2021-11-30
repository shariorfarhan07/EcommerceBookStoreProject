package com.example.ecommercebookstoreproject.dao;

import com.example.ecommercebookstoreproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookdao extends JpaRepository<Book,Integer> {
}

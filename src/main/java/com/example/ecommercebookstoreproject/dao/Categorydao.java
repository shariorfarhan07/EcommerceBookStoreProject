package com.example.ecommercebookstoreproject.dao;
import com.example.ecommercebookstoreproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categorydao extends JpaRepository<Category,Integer> {

}

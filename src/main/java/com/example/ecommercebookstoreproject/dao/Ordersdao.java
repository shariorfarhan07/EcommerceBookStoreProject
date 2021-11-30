package com.example.ecommercebookstoreproject.dao;


import com.example.ecommercebookstoreproject.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Ordersdao extends JpaRepository<Orders,Integer> {
}

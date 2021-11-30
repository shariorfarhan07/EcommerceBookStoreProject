package com.example.ecommercebookstoreproject.dao;

import com.example.ecommercebookstoreproject.model.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderListdao extends JpaRepository<OrderList,Integer> {

}

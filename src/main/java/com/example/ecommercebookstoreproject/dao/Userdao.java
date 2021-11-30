package com.example.ecommercebookstoreproject.dao;

import com.example.ecommercebookstoreproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao extends JpaRepository<User,Integer> {
}

package com.example.ecommercebookstoreproject.dao;
import com.example.ecommercebookstoreproject.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Commentsdao extends JpaRepository<Comments,Integer> {
}

package com.example.jpamanytomanyuseprimarykey.repository;

import com.example.jpamanytomanyuseprimarykey.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}

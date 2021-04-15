package com.example.jpamanytomanyuseprimarykey.repository;

import com.example.jpamanytomanyuseprimarykey.model.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository<BookPublisher,Integer> {
}

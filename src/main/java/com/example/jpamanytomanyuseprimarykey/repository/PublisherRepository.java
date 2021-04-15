package com.example.jpamanytomanyuseprimarykey.repository;

import com.example.jpamanytomanyuseprimarykey.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}

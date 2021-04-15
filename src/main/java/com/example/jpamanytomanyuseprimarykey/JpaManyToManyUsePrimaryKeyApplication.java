package com.example.jpamanytomanyuseprimarykey;

import com.example.jpamanytomanyuseprimarykey.model.Book;
import com.example.jpamanytomanyuseprimarykey.model.BookPublisher;
import com.example.jpamanytomanyuseprimarykey.model.Publisher;
import com.example.jpamanytomanyuseprimarykey.repository.BookPublisherRepository;
import com.example.jpamanytomanyuseprimarykey.repository.BookRepository;
import com.example.jpamanytomanyuseprimarykey.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JpaManyToManyUsePrimaryKeyApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    PublisherRepository publisherRepository;
    @Autowired
    BookPublisherRepository bookPublisherRepository;

    public static void main (String[] args) {
        SpringApplication.run(JpaManyToManyUsePrimaryKeyApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception {
        Book book = new Book("SpringBoot");
        Book book2 = new Book("JavaCore");
        bookRepository.saveAll(Arrays.asList(book,book2));

        Publisher publisher1 = new Publisher("FptAptech");
        Publisher publisher2 = new Publisher("TheGioi");
        publisherRepository.saveAll(Arrays.asList(publisher1,publisher2));

        BookPublisher bookPublisher1 = new BookPublisher(book,publisher1,new Date());
        BookPublisher bookPublisher2 = new BookPublisher(book,publisher2,new Date());

        bookPublisherRepository.saveAll(Arrays.asList(bookPublisher1,bookPublisher2));
    }
}

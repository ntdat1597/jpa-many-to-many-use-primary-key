package com.example.jpamanytomanyuseprimarykey.controller;

import com.example.jpamanytomanyuseprimarykey.model.Book;
import com.example.jpamanytomanyuseprimarykey.repository.BookPublisherRepository;
import com.example.jpamanytomanyuseprimarykey.repository.BookRepository;
import com.example.jpamanytomanyuseprimarykey.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookRepository bookRepository;
    PublisherRepository publisherRepositor;
    BookPublisherRepository bookPublisherRepository;

    @RequestMapping("/")
    public String index (Model model) {
        List<Book> books = (List<Book>) bookRepository.findAll();
        model.addAttribute("books", books);
        return "index";
    }

    @RequestMapping(value = "add")
    public String addBook (Model model) {
        model.addAttribute("book", new Book());
        return "add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save (Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }
}
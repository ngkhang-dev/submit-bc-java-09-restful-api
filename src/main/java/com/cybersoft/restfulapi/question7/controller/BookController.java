package com.cybersoft.restfulapi.question7.controller;

import com.cybersoft.restfulapi.question7.model.Book;
import com.cybersoft.restfulapi.question7.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/search")
    public List<Book> getListByAuthor(@RequestParam String author) {
        return bookService.findByAuthor(author);
    }
}

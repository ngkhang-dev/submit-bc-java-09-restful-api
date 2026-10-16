package com.cybersoft.restfulapi.question7.service;

import com.cybersoft.restfulapi.question7.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final static List<Book> mockData = new ArrayList<>();
    private static int mockIndex = 0;

    public BookService() {
        Book book1 = new Book();
        book1.setId(0);
        book1.setName("Sài Gòn năm xưa");
        book1.setAuthor("Vương Hồng Sển");

        Book book2 = new Book();
        book2.setId(1);
        book2.setName("Anonymous");
        book2.setAuthor("abc");

        mockData.add(book1);
        mockData.add(book2);

        mockIndex = 2;
    }

    public List<Book> findAll() {
        return mockData;
    }

    public List<Book> findByAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            return findAll();
        }

        return mockData
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }
}

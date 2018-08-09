package com.example.bookapp.service;

import com.example.bookapp.model.Book;
import com.example.bookapp.utils.BookStub;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public List<Book> findAll() {

        return BookStub.findAll();
    }

    public Book findOne(Long id) {

        return BookStub.findOne(id);
    }

    public Book create(Book book) {

        return BookStub.create(book);
    }

    public Book update(Long id, Book book) {

        return BookStub.update(id, book);
    }

    public void delete(Long id) {

        BookStub.delete(id);
    }
}

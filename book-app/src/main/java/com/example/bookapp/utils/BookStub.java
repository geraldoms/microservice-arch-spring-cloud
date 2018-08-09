package com.example.bookapp.utils;

import com.example.bookapp.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookStub {

    private static HashMap<Long, Book> books = new HashMap<>();
    private static Long counter;

    static {
        books.put(1L, new Book(1L, "Clean Code: A Handbook of Agile Software Craftsmanship", 24.00));
        books.put(2L, new Book(2L, "The Phoenix Project: A Novel about IT, DevOps, and Helping Your Business Win", 23.69));
        books.put(3L, new Book(3L, "StrengthsFinder 2.0", 14.99));

        counter = 3L;
    }

    public static List<Book> findAll() {

        return new ArrayList<>(books.values());
    }

    public static Book findOne(Long id) {

        return books.get(id);
    }

    public static Book create(Book book) {

        counter++;
        book.setId(counter);
        books.put(counter, book);
        return book;
    }

    public static Book update(Long id, Book book) {

        books.put(id, book);
        return book;
    }

    public static void delete(long id) {

        books.remove(id);
    }

}

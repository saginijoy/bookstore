package com.cognizant.bookstore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
final class BookRepository {

    private final List<Book> books = new ArrayList<>();

    List<Book> list(){
        return Collections.unmodifiableList(books);
    }

    Book save(final Book book) {
        books.add(book);
        return book;
    }

    void deleteAll() {
        books.clear();
    }
}

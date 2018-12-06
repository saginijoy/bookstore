package com.cognizant.bookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController("/books")
final class BookController {

    private final BookRepository bookRepository;

    BookController(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;

    }

    @GetMapping
    List<Book> list(){
        return bookRepository.list();
    }
}

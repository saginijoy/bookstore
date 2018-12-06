package com.cognizant.bookstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController("/books")
final class BookController {

    @GetMapping
    List<Book> list(){
        return Collections.emptyList();
    }
}

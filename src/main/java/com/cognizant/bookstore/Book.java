package com.cognizant.bookstore;

import java.util.Objects;

final class Book {

    private String author;
    private String title;

    public Book() {
    }

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Book book = (Book) o;
        return getAuthor().equals(book.getAuthor()) &&
                getTitle().equals(book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }
}

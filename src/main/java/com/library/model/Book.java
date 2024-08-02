package com.library.model;

import java.util.ArrayList;

public class Book {

    private int id;
    private Long isbn;
    private String title;
    private String author;
    private boolean isLoaned;
    
    public Book(int id, Long isbn, String title, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Long getIsbn() {
        return isbn;
    }
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isLoaned() {
        return isLoaned;
    }
    public void setLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", isLoaned="
                + isLoaned + "]";
    }

    
}

package com.library.model;

import java.util.ArrayList;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private String author;
    private boolean isLoaned;
    
    public Book(int id, String isbn, String title, String author) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String isbn, String title, String author, boolean isLoaned) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isLoaned = isLoaned;
    }

    public Book() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
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
        return String.format("ID: %-3d | ISBN: %-17s | Title: %-30s | Author: %-20s | Loaned: %-5s",
                id, isbn, title, author, isLoaned);
    }

    
}

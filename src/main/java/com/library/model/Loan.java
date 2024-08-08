package com.library.model;

public class Loan {

    //Variables
    private int bookId;
    private int userId;
    private String bookName;
    private String userName;

    //Constructors
    public Loan() {
    }
    
    public Loan(int bookId, int userId, String bookName, String userName) {
        this.bookId = bookId;
        this.userId = userId;
        this.bookName = bookName;
        this.userName = userName;
    }

    //Getters / Setters
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //ToString
    @Override
    public String toString() {
        return "Book Id: " + bookId + " | User ID: " + userId + " | Book Name: " + bookName + " |  User Name: " + userName;
    }

    
}

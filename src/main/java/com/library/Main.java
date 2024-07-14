package com.library;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.model.Loan;
import com.library.model.User;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Loan> loans = new ArrayList<Loan>();
        Book book = new Book(0, "111", "o conto", "Fulano");
        User user = new User(0, "Joaozinho", "123456789", "Rua dos bobos 0");
        users.add(user);
        books.add(book);
        
        //method to add to loan (borrow book) (dar um loans.add no loan para gravar ele na lista de loans)
        Loan loan = new Loan(0, 0);
        loans.add(loan);
        List<Book> booksBorrowed = new ArrayList<Book>();
        book.setLoaned(true); 
        booksBorrowed.add(book);
        /* 
         * TO DO
         * função para pegar usuario para gravar o livro nele
        */
        user.setBooksBorrowed(booksBorrowed);
        //

        // method to search user or book in the loan
        int userToSearch = 0; //id do usuario vai aqui
        int iterator = 0;
        for(Loan loanSearch : loans){
            if(loanSearch.getUserId() == userToSearch){
                System.out.println("found");
                iterator++;
            }
            //retornar um true ou false ou o id do usuario, o que for mais conveniente
        }
        
        // show all users
        ArrayList<User> usersInLoans = new ArrayList<>();

        for(int i = 0; i < loans.size(); i++){

            for(int j = 0; j < users.size(); j++){
                Loan l = loans.get(i);
                usersInLoans.add(users.get(l.getUserId()));
            }
        }
        System.out.println(usersInLoans.toString());
        
        //Returning a book (user id + book id)
        boolean userAndBookFound = false;
        for(Loan l : loans){
            if(l.getBookId() == 0 /* book id*/ && l.getUserId() == 0 /* user id */){
                System.out.println("user and book found");
                userAndBookFound = true;
            }
        }

        if(userAndBookFound == true){
            Book bookToReturn = books.get(0 /*book id */);  
            System.out.println("opa");
            bookToReturn.setLoaned(false);
            User userReturningBook = users.get(0 /*user id */);
            /* TO DO
             * Metodo para pegar o livro na lista do usuario 
             */
            user.getBooksBorrowed().remove(0);
        }
        System.out.println(user.toString());


    }
}
package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.BookManagementGrpc.BookManagementImplBase;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.BookOuterClass.Empty;
import com.grpcfiles.UserOuterClass.UserResponse;
import com.library.model.Book;

import io.grpc.stub.StreamObserver;

public class BookService extends BookManagementImplBase{

    ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(BookRequest request, StreamObserver<BookResponse> responseObserver){
        System.out.println("Chamada add book");       
        int bookId = books.size();
        Long isbn = request.getIsbn();
        String title = request.getTitle();
        String author = request.getAuthor();
        boolean isLoaned = false;

        Book book = new Book(bookId, isbn, title, author);
        book.setLoaned(isLoaned);

        books.add(book);

        BookResponse.Builder response = BookResponse.newBuilder();
        System.out.println("ok");
        response.setMessage(book.toString());
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void listBooks(Empty request, StreamObserver<BookResponse> responseObserver) {
        for (Book book : books) {
                    BookResponse response = BookResponse.newBuilder().
                    setMessage(book.toString()).build();
                    responseObserver.onNext(response);
        }
                responseObserver.onCompleted();
    }

    @Override
    public void removeBook(BookRequest request, StreamObserver<BookResponse> responseObserver) {
        int bookId = request.getBookId();
        Book book = new Book(bookId, null, null, null);

        //Search for the user in the list
        int position = 0;
        boolean found = false;
        for(Book bookToRemove:books){
            if(bookToRemove.getId() == book.getId()){
                found = true;
                break;
            }
            position++;
        }

       //remove the user and create a response
        BookResponse.Builder response;

        if(found){
            books.remove(position); 
            response = BookResponse.newBuilder();
            response.setMessage("user " + book.getId() + " removed");           
        }else{
            response = BookResponse.newBuilder();
            response.setMessage("user not found");  
        }
        
        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();
    }

    

    // @Override
    // public void removeUsers(UserRequest request, StreamObserver<UserResponse> responseObserver){
    //     System.out.println("chamando o metodo removeUser");
    //     //Store the user in an user object
    //     int userId = request.getUserId();
    //     User user = new User(userId, "null", "null", "null");

    //     //Search for the user in the list
    //     int position = 0;
    //     boolean found = false;
    //     for(User userToRemove:users){
    //         if(userToRemove.getId() == user.getId()){
    //             found = true;
    //             break;
    //         }
    //         position++;
    //     }
}

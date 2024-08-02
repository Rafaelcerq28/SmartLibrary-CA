package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.BookManagementGrpc.BookManagementImplBase;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.BookOuterClass.Empty;
import com.grpcfiles.UserOuterClass.UserResponse;
import com.library.model.Book;
import com.library.model.User;

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
    

    //     @Override
    // public void getUsers(Empty request, StreamObserver<UserResponse> responseObserver){
        
    //     for (User user : users) {
    //         UserResponse response = UserResponse.newBuilder().
    //         setMessage(user.toString()).build();
    //         responseObserver.onNext(response);
    //     }
    //     responseObserver.onCompleted();
    // }
}

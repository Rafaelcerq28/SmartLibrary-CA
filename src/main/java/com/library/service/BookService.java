package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.BookManagementGrpc.BookManagementImplBase;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.library.model.Book;

import io.grpc.stub.StreamObserver;

public class BookService extends BookManagementImplBase{

    ArrayList<Book> books = new ArrayList<>();

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

}

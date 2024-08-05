package com.library.client;

import java.util.Iterator;

import com.grpcfiles.BookManagementGrpc;
import com.grpcfiles.BookManagementGrpc.BookManagementBlockingStub;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.BookOuterClass.BookStatusRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestClientBook {

    public static void main(String[] args) {

        ManagedChannel bookChannel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        BookManagementBlockingStub bookStub = BookManagementGrpc.newBlockingStub(bookChannel);

        // building my book
        BookRequest bookRequest = BookRequest.newBuilder().
                                    setIsbn("null").
                                    setAuthor("null").
                                    setTitle("null").
                                    build();

        // sending my book
        BookResponse bookResponse = bookStub.addBook(bookRequest);
        // show the return message
        System.out.println(bookResponse.getMessage());

        bookRequest = BookRequest.newBuilder().
                                    setIsbn("null").
                                    setAuthor("null").
                                    setTitle("null").
                                    build();

        // sending my book
        bookResponse = bookStub.addBook(bookRequest);
        // show the return message
        System.out.println(bookResponse.getMessage());

        bookRequest = BookRequest.newBuilder().
                                    setIsbn("null").
                                    setAuthor("null").
                                    setTitle("null").
                                    build();

        // sending my book
        bookResponse = bookStub.addBook(bookRequest);
        // show the return message
        System.out.println(bookResponse.getMessage());

        // showing the list of Books
        System.out.println("\nList of Books");
        Iterator<BookResponse> responseList = bookStub.listBooks(null);
        // iterates my iteratos to return a list os users
        while (responseList.hasNext()) {
            System.out.println(responseList.next().getMessage());
        }

        // to remove user
        // bookRequest = bookRequest.newBuilder().setBookId(0).build();
        // bookResponse = bookStub.removeBook(bookRequest);
        // System.out.println(bookResponse.getMessage());

        //Isso ta funcionando em partes, checar na book service se o livro esta sendo atualizado(Esta sim)
        BookStatusRequest bookStatusRequest = BookStatusRequest.newBuilder().
                                                        setIsLoaned(true).
                                                        setBookId(10).
                                                        build();

        bookResponse = bookStub.bookTransaction(bookStatusRequest);
        System.out.println(bookResponse.getMessage());
    }

}

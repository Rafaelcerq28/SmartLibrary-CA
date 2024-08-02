package com.library.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.grpcfiles.BookManagementGrpc;
import com.grpcfiles.BookManagementGrpc.BookManagementBlockingStub;
import com.grpcfiles.BookManagementGrpc.BookManagementStub;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.UserOuterClass.UserResponse;
import com.library.model.Book;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TestClientBook {

    public static void main(String[] args) {

   ManagedChannel bookChannel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
    BookManagementBlockingStub bookStub = BookManagementGrpc.newBlockingStub(bookChannel);

        // private static StringsServiceGrpc.StringsServiceBlockingStub blockingStub;
        // // Asynch stub
        // private static StringsServiceGrpc.StringsServiceStub asyncStub;
        
        //building my book
        BookRequest bookRequest = BookRequest.newBuilder().
                                                setIsbn(123123).
                                                setAuthor("null").
                                                setTitle("null").
                                                build();
        
        //sending my book
        BookResponse bookResponse = bookStub.addBook(bookRequest);
        // show the return message
        System.out.println(bookResponse.getMessage());

         bookRequest = BookRequest.newBuilder().
                                                setIsbn(123123).
                                                setAuthor("null").
                                                setTitle("null").
                                                build();
        
        //sending my book
         bookResponse = bookStub.addBook(bookRequest);
        // show the return message
        System.out.println(bookResponse.getMessage());        
        
        bookRequest = BookRequest.newBuilder().
                                            setIsbn(123123).
                                            setAuthor("null").
                                            setTitle("null").
                                            build();

        //sending my book
        bookResponse = bookStub.addBook(bookRequest);
        // show the return message
        System.out.println(bookResponse.getMessage());   

        //showing the list of Books
        System.out.println("\n List of Books");
        Iterator<BookResponse> responseList = bookStub.listBooks(null);
        //iterates my iteratos to return a list os users
        while (responseList.hasNext()) {
            System.out.println(responseList.next().getMessage());    
        }

    }


}


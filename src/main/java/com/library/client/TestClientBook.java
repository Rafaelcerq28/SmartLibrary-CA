package com.library.client;

import com.grpcfiles.BookManagementGrpc;
import com.grpcfiles.BookManagementGrpc.BookManagementBlockingStub;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestClientBook {
    public static void main(String[] args) {
        ManagedChannel bookChannel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        BookManagementBlockingStub bookStub = BookManagementGrpc.newBlockingStub(bookChannel);

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
    }

}

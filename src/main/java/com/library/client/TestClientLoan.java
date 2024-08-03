package com.library.client;

import com.grpcfiles.LoanManagementGrpc;
import com.grpcfiles.BookManagementGrpc;
import com.grpcfiles.BookManagementGrpc.BookManagementBlockingStub;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.BookOuterClass.BookStatusRequest;
import com.grpcfiles.Loan.LoanRequest;
import com.grpcfiles.Loan.LoanResponse;
import com.grpcfiles.LoanManagementGrpc.LoanManagementBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestClientLoan {
    public static void main(String[] args) {

        ManagedChannel libraryChannel = ManagedChannelBuilder.forAddress("localhost", 9092).usePlaintext().build();
        LoanManagementBlockingStub libraryStub = LoanManagementGrpc.newBlockingStub(libraryChannel);

        //To test
        ManagedChannel bookChannel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
        BookManagementBlockingStub bookStub = BookManagementGrpc.newBlockingStub(bookChannel);
        //To test


        LoanRequest loanRequest = LoanRequest.newBuilder().
                                        setBookId(1).setUserId(0).
                                        setBookName("The Da Vinci Code").
                                        setUserName("Rafael").
                                        build();

        LoanResponse loanResponse = libraryStub.borrowBook(loanRequest);
        System.out.println(loanResponse.getMessage());

        BookStatusRequest bookRequest = BookStatusRequest.newBuilder().
                                                        setBookId(1).
                                                        setIsLoaned(true).
                                                        build();

        BookResponse bookResponse = bookStub.bookTransaction(bookRequest);
        System.out.println(bookResponse.getMessage());
        
    }
}

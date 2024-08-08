package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.Loan.Empty;
import com.grpcfiles.Loan.LoanRequest;
import com.grpcfiles.Loan.LoanResponse;
import com.grpcfiles.LoanManagementGrpc.LoanManagementImplBase;
import com.library.model.Book;
import com.library.model.Loan;

import io.grpc.stub.StreamObserver;

public class LibraryService extends LoanManagementImplBase{
    //ArrayList to store the loaned books
    ArrayList<Loan> booksLoaned = new ArrayList<>();

    @Override
    public void borrowBook(LoanRequest request, StreamObserver<LoanResponse> responseObserver) {
        // Extract the details from the request
        int bookId = request.getBookId();
        int userId = request.getUserId();
        String bookName = request.getBookName();
        String userName = request.getUserName();

        // Create a new Loan object with the provided details
        Loan loan = new Loan(bookId, userId, bookName, userName);

        // Add the loan record to the collection
        booksLoaned.add(loan);

        // Prepare the response
        LoanResponse.Builder response = LoanResponse.newBuilder();

        response.setMessage(loan.toString());

        // Send the response to the client
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void returnBook(LoanRequest request, StreamObserver<LoanResponse> responseObserver) {
        int bookId = request.getBookId();
        int userId = request.getUserId();

        Loan borrowed = new Loan(bookId, userId, "", "");
        
        int position = 0;
        boolean found = false;
        // Search for the loan record in the list

        for (Loan loan : booksLoaned) {
            if(loan.getUserId() == userId && loan.getBookId() == bookId){
                found = true;
                break;
            }
            position++;
        }            

        
        // Send the response to the client
        booksLoaned.remove(position);
        LoanResponse.Builder response = LoanResponse.newBuilder();

        response.setMessage(booksLoaned.toString());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


}

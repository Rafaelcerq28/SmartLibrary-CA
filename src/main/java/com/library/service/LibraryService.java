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

    ArrayList<Loan> booksLoaned = new ArrayList<>();

    @Override
    public void borrowBook(LoanRequest request, StreamObserver<LoanResponse> responseObserver) {
        // TODO Auto-generated method stub
        int bookId = request.getBookId();
        int userId = request.getUserId();
        String bookName = request.getBookName();
        String userName = request.getUserName();

        Loan loan = new Loan(bookId, userId, bookName, userName);
        booksLoaned.add(loan);

        LoanResponse.Builder response = LoanResponse.newBuilder();

        response.setMessage(loan.toString());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    @Override
    public void monitorLoans(Empty request, StreamObserver<LoanResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.monitorLoans(request, responseObserver);
    }

    @Override
    public void returnBook(LoanRequest request, StreamObserver<LoanResponse> responseObserver) {
        // TODO Auto-generated method stub
        int bookId = request.getBookId();
        int userId = request.getUserId();

        Loan borrowed = new Loan(bookId, userId, "", "");
        
                int position = 0;
        boolean found = false;

        for (Loan loan : booksLoaned) {
            if(loan.getUserId() == userId && loan.getBookId() == bookId){
                found = true;
            }
            position++;
        }

        booksLoaned.remove(position);
        LoanResponse.Builder response = LoanResponse.newBuilder();

        response.setMessage(booksLoaned.toString());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }


}

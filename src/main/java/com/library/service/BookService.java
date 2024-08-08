package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.BookManagementGrpc.BookManagementImplBase;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.BookOuterClass.BookStatusRequest;
import com.grpcfiles.BookOuterClass.Empty;
import com.library.model.Book;

import io.grpc.stub.StreamObserver;

public class BookService extends BookManagementImplBase{

    //ArrayList to store the books
    ArrayList<Book> books = new ArrayList<>();

    //Add the books when the service is created
    public BookService() {
        books.add(new Book(books.size(), "978-0-345-39180-3", "The Hobbit", "J.R.R. Tolkien", false));
        books.add(new Book(books.size(), "978-0-7432-7356-5", "The Da Vinci Code", "Dan Brown", false));
        books.add(new Book(books.size(), "978-0-452-28423-4", "To Kill a Mockingbird", "Harper Lee", false));
        books.add(new Book(books.size(), "978-0-06-112008-4", "1984", "George Orwell", false));
        books.add(new Book(books.size(), "978-0-14-028329-7", "The Great Gatsby", "F. Scott Fitzgerald", false));
        books.add(new Book(books.size(), "978-0-618-00222-8", "Harry Potter", "J.K. Rowling", false));
        books.add(new Book(books.size(), "978-0-679-64185-5", "The Catcher in the Rye", "J.D. Salinger", false));
        books.add(new Book(books.size(), "978-0-452-28425-8", "Brave New World", "Aldous Huxley", false));
        books.add(new Book(books.size(), "978-0-316-76948-0", "The Girl with", "Stieg Larsson", false));
        books.add(new Book(books.size(), "978-0-14-017739-8", "Of Mice and Men", "John Steinbeck", false));        
    }

    @Override
    public void addBook(BookRequest request, StreamObserver<BookResponse> responseObserver){      
         // Generate a unique book ID
        int bookId = books.size();
        // Retrieve information from the request
        String isbn = request.getIsbn();
        String title = request.getTitle();
        String author = request.getAuthor();
        boolean isLoaned = false;

        // Create a new Book instance with the provided details
        Book book = new Book(bookId, isbn, title, author);
        //Initialize the book as not loaned
        book.setLoaned(isLoaned);

        // Add the book to the collection
        books.add(book);

        // Build the response
        BookResponse.Builder response = BookResponse.newBuilder();
        response.setMessage(book.toString());

        // Send the response to the client
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void listBooks(Empty request, StreamObserver<BookResponse> responseObserver) {
        // Iterate over the collection of books
        for (Book book : books) {
            // Build a BookResponse for each book
            BookResponse response = BookResponse.newBuilder().
            setMessage(book.toString()).build();
            // Send the response to the client
            responseObserver.onNext(response);
        }
        // Signal that all responses have been sent   
        responseObserver.onCompleted();
    }

    @Override
    public void removeBook(BookRequest request, StreamObserver<BookResponse> responseObserver) {
        // Extract the book ID from the request
        int bookId = request.getBookId();
        Book book = new Book(bookId, null, null, null);

        // Create a variable to track if the book was found
        int position = 0;
        boolean found = false;

        // Search for the book in the list
        for(Book bookToRemove:books){
            if(bookToRemove.getId() == book.getId()){
                found = true;
                break;
            }
            position++;
        }

       // Prepare the response
        BookResponse.Builder response;

        if(found){
            // Remove the book from the collection
            books.remove(position); 
            response = BookResponse.newBuilder();
            response.setMessage("Book " + book.getId() + " was removed");           
        }else{
            response = BookResponse.newBuilder();
            response.setMessage("Book not found");  
        }

        // Send the response to the client
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void bookTransaction(BookStatusRequest request, StreamObserver<BookResponse> responseObserver) {
        // Extract the loan status and book ID from the request
        boolean isLoaned = request.getIsLoaned();
        int bookId = request.getBookId();
        String message = "book status updated";

        // Initialize variables to track position and whether the book was found
        int position = 0;
        boolean found = false;

        // Search for the book by ID in the collection
        for (Book book : books) {
            if(book.getId() == bookId){
                found = true;
                break;
            }
            position++;
        }

        // If the book is found, update its loan status
        if(found){
            Book updatedBook = books.get(position);
            updatedBook.setLoaned(isLoaned);
            books.set(position, updatedBook);
        }else{
            message = "book not found";
        }
        
        // Build and send the response
        BookResponse.Builder response;
        response = BookResponse.newBuilder();
        response.setMessage(message);

        responseObserver.onNext(response.build());
        // Complete the RPC call
        responseObserver.onCompleted();
    }


}

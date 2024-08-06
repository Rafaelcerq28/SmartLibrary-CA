package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.BookManagementGrpc.BookManagementImplBase;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.BookOuterClass.BookStatusRequest;
import com.grpcfiles.BookOuterClass.Empty;
import com.grpcfiles.UserOuterClass.UserResponse;
import com.library.model.Book;

import io.grpc.stub.StreamObserver;

public class BookService extends BookManagementImplBase{

    ArrayList<Book> books = new ArrayList<>();

    

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
        int bookId = books.size();
        String isbn = request.getIsbn();
        String title = request.getTitle();
        String author = request.getAuthor();
        boolean isLoaned = false;

        Book book = new Book(bookId, isbn, title, author);
        book.setLoaned(isLoaned);

        books.add(book);

        BookResponse.Builder response = BookResponse.newBuilder();
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

       //remove the book and create a response
        BookResponse.Builder response;

        if(found){
            books.remove(position); 
            response = BookResponse.newBuilder();
            response.setMessage("Book " + book.getId() + " was removed");           
        }else{
            response = BookResponse.newBuilder();
            response.setMessage("Book not found");  
        }
        
        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();
    }

    @Override
    public void bookTransaction(BookStatusRequest request, StreamObserver<BookResponse> responseObserver) {
        boolean isLoaned = request.getIsLoaned();
        int bookId = request.getBookId();
        String message = "book status updated";
        int position = 0;
        boolean found = false;

        for (Book book : books) {
            if(book.getId() == bookId){
                found = true;
                break;
            }
            position++;
        }

        if(found){
            Book updatedBook = books.get(position);
            updatedBook.setLoaned(isLoaned);
            books.set(position, updatedBook);
        }else{
            message = "book not found";
        }
        

        BookResponse.Builder response;

        response = BookResponse.newBuilder();
        
        response.setMessage(message);

        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();
    }


}

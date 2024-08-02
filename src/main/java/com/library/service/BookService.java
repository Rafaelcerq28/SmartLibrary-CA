package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.BookManagementGrpc.BookManagementImplBase;
import com.grpcfiles.BookOuterClass.BookRequest;
import com.grpcfiles.BookOuterClass.BookResponse;
import com.grpcfiles.BookOuterClass.Empty;
import com.grpcfiles.UserOuterClass.UserResponse;
import com.library.model.Book;

import io.grpc.stub.StreamObserver;

public class BookService extends BookManagementImplBase{

    ArrayList<Book> books = new ArrayList<>();

    

    public BookService() {
        books.add(new Book(books.size(), "978-0-345-39180-3", "The Hobbit", "J.R.R. Tolkien", true));
        books.add(new Book(books.size(), "978-0-7432-7356-5", "The Da Vinci Code", "Dan Brown", true));
        books.add(new Book(books.size(), "978-0-452-28423-4", "To Kill a Mockingbird", "Harper Lee", true));
        books.add(new Book(books.size(), "978-0-06-112008-4", "1984", "George Orwell", true));
        books.add(new Book(books.size(), "978-0-14-028329-7", "The Great Gatsby", "F. Scott Fitzgerald", true));
        books.add(new Book(books.size(), "978-0-618-00222-8", "Harry Potter", "J.K. Rowling", true));
        books.add(new Book(books.size(), "978-0-679-64185-5", "The Catcher in the Rye", "J.D. Salinger", true));
        books.add(new Book(books.size(), "978-0-452-28425-8", "Brave New World", "Aldous Huxley", true));
        books.add(new Book(books.size(), "978-0-316-76948-0", "The Girl with", "Stieg Larsson", true));
        books.add(new Book(books.size(), "978-0-14-017739-8", "Of Mice and Men", "John Steinbeck", true));        
    }

    @Override
    public void addBook(BookRequest request, StreamObserver<BookResponse> responseObserver){
        System.out.println("Chamada add book");       
        int bookId = books.size();
        String isbn = request.getIsbn();
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

       //remove the user and create a response
        BookResponse.Builder response;

        if(found){
            books.remove(position); 
            response = BookResponse.newBuilder();
            response.setMessage("user " + book.getId() + " removed");           
        }else{
            response = BookResponse.newBuilder();
            response.setMessage("user not found");  
        }
        
        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();
    }

    

    // @Override
    // public void removeUsers(UserRequest request, StreamObserver<UserResponse> responseObserver){
    //     System.out.println("chamando o metodo removeUser");
    //     //Store the user in an user object
    //     int userId = request.getUserId();
    //     User user = new User(userId, "null", "null", "null");

    //     //Search for the user in the list
    //     int position = 0;
    //     boolean found = false;
    //     for(User userToRemove:users){
    //         if(userToRemove.getId() == user.getId()){
    //             found = true;
    //             break;
    //         }
    //         position++;
    //     }
}

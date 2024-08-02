package com.library.server;

import java.io.IOException;

import com.library.service.BookService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BookServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Criando nosso server chamando o server builder e
        // setando uma porta para o servidor e 
        // adicionando o serviço que esse servidor vai iniciar
        Server server = ServerBuilder.
                    forPort(9091).
                    addService(new BookService()).
                    build();  

        //Dando start no servidor (essa parte pede para lançar uma exeção)
        server.start();
        System.out.println("Server started at " + server.getPort());
        
        //isso Waits for the server to become terminated
        server.awaitTermination();
    }
}

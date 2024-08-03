package com.library.server;

import java.io.IOException;
import java.util.logging.Logger;

import com.library.service.BookService;
import com.library.service.LibraryService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LibraryServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 9092;
        Logger logger = Logger.getLogger(LibraryServer.class.getName());
        //Criando nosso server chamando o server builder e
        // setando uma porta para o servidor e 
        // adicionando o serviço que esse servidor vai iniciar
        Server server = ServerBuilder.
                    forPort(9092).
                    addService(new LibraryService()).
                    build();  

        //Dando start no servidor (essa parte pede para lançar uma exeção)
        server.start();
        System.out.println("Server started at " + server.getPort());
        logger.info("Server started, listening on " + port);
        //isso Waits for the server to become terminated
        server.awaitTermination();
    }
}

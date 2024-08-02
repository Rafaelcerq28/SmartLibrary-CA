package com.library.server;

import java.io.IOException;
import java.util.logging.Logger;

import com.library.service.BookService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BookServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 9091;
        Logger logger = Logger.getLogger(BookServer.class.getName());
        //Criando nosso server chamando o server builder e
        // setando uma porta para o servidor e 
        // adicionando o serviço que esse servidor vai iniciar
        Server server = ServerBuilder.
                    forPort(port).
                    addService(new BookService()).
                    build();  

        //Dando start no servidor (essa parte pede para lançar uma exeção)
        server.start();

        logger.info("Server started, listening on " + port);
        
        //isso Waits for the server to become terminated
        server.awaitTermination();
    }
}

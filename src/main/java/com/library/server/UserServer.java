package com.library.server;

import java.io.IOException;
import java.util.logging.Logger;

import com.library.service.UserService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class UserServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 9090;
        Logger logger = Logger.getLogger(BookServer.class.getName());
        //Criando nosso server chamando o server builder e
        // setando uma porta para o servidor e 
        // adicionando o serviço que esse servidor vai iniciar
        Server server = ServerBuilder.
                    forPort(port).
                    addService(new UserService()).
                    build();  

        //Dando start no servidor (essa parte pede para lançar uma exeção)
        server.start();
        System.out.println("Server started at " + server.getPort());
        logger.info("Server started, listening on " + port);
        
        //isso Waits for the server to become terminated
        server.awaitTermination();
    }
}


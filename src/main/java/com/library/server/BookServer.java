package com.library.server;

import java.io.IOException;
import java.util.logging.Logger;

import com.library.service.BookService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BookServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Define the server port
        int port = 9091;

        // Initialize the logger
        Logger logger = Logger.getLogger(BookServer.class.getName());

        // Build the gRPC server, binding it to the specified port and adding the BookService
        Server server = ServerBuilder
                            .forPort(port)
                            .addService(new BookService())
                            .build();

        // Start the server
        server.start();
        System.out.println("Server started at " + server.getPort());
        logger.info("Server started, listening on port " + port);

        // Keep the server running and wait for termination
        server.awaitTermination();
    }
}

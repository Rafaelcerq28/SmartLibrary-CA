package com.library.server;

import java.io.IOException;
import java.util.logging.Logger;

import com.library.service.LibraryService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LibraryServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Define the server port
        int port = 9092;
        // Initialize the logger
        Logger logger = Logger.getLogger(LibraryServer.class.getName());

        // Build the gRPC server, binding it to the specified port and adding the LibraryService     
        Server server = ServerBuilder.
                    forPort(9092).
                    addService(new LibraryService()).
                    build();  

        // Start the server            
        server.start();
        System.out.println("Server started at " + server.getPort());
        logger.info("Server started, listening on " + port);
        // Keep the server running and wait for termination
        server.awaitTermination();
    }
}

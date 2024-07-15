package com.library.client;

import com.grpcfiles.UserManagementGrpc;
import com.grpcfiles.UserManagementGrpc.UserManagementBlockingStub;
import com.grpcfiles.UserOuterClass.UserRequest;
import com.grpcfiles.UserOuterClass.UserResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.
                        forAddress("localhost", 9090).
                        usePlaintext().
                        build();    

         UserManagementBlockingStub userStub = UserManagementGrpc.newBlockingStub(channel);
         
         UserRequest userRequest = UserRequest.newBuilder().setUserId(1).setName("teste").build();

         UserResponse response = userStub.addUser(userRequest);

         System.out.println(response.getMessage());
    }
}   

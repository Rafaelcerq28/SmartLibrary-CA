package com.library.client;


import com.grpcfiles.UserManagementGrpc;
import com.grpcfiles.UserManagementGrpc.UserManagementBlockingStub;
import com.grpcfiles.UserOuterClass.UserRequest;
import com.grpcfiles.UserOuterClass.UserResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TestClient {
    public static void main(String[] args) {
        ManagedChannel userChannel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
        

        UserManagementBlockingStub userStub = UserManagementGrpc.newBlockingStub(userChannel);
        // Call the user request sending a "test" as name and 1 as user Id
        
        UserRequest userRequest = UserRequest.newBuilder().
                                            setName("Rafael").
                                            setPhone("083 014 7187").
                                            setAddress("summerhill parade").
                                            build();

        UserResponse response = userStub.addUser(userRequest);
        // show the return message
        System.out.println(response.getMessage());


        // adding the second user
        userRequest = UserRequest.newBuilder().
                                            setName("Flavia").
                                            setPhone("083 014 7324").
                                            setAddress("summerhill parade").
                                            build();

        response = userStub.addUser(userRequest); 
        // show the return message
        System.out.println(response.getMessage());
        //end second user 

        //showing the list of users
        System.out.println("\nList of user");
        java.util.Iterator<UserResponse> responseList = userStub.getUsers(null);
        //iterates my iteratos to return a list os users
        while (responseList.hasNext()) {
            System.out.println(responseList.next().getMessage());    
        }
        

        //to remove user
        userRequest = UserRequest.newBuilder().setUserId(0).build();
        response = userStub.removeUsers(userRequest);
        System.out.println(response.getMessage());
        
    }
}

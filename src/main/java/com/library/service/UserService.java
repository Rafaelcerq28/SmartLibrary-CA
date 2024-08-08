package com.library.service;

import java.util.ArrayList;

import com.grpcfiles.UserManagementGrpc.UserManagementImplBase;
import com.grpcfiles.UserOuterClass.Empty;
import com.grpcfiles.UserOuterClass.UserRequest;
import com.grpcfiles.UserOuterClass.UserResponse;
import com.library.model.User;

import io.grpc.stub.StreamObserver;

public class UserService extends UserManagementImplBase{

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void addUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        // Generate a new user ID based on the current size of the users list
        int userId = users.size();
        // Extract user details from the request
        String userName = request.getName();
        String userPhone = request.getPhone();
        String userAddress = request.getAddress();

        // Create a new User object with the provided details
        User user = new User(userId, userName, userPhone, userAddress);
        // Add the new user to the users list
        users.add(user);

        // Prepare the response        
        UserResponse.Builder response = UserResponse.newBuilder();

        response.setMessage(user.toString());
        // Send the response to the client
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void removeUsers(UserRequest request, StreamObserver<UserResponse> responseObserver){
        // Extract the user ID from the request
        int userId = request.getUserId();
        User user = new User(userId, "null", "null", "null");

        // Initialize variables to track the position and whether the user was found
        int position = 0;
        boolean found = false;
        // Search for the user in the list by userId
        for(User userToRemove:users){
            if(userToRemove.getId() == user.getId()){
                found = true;
                break;
            }
            position++;
        }

        // Prepare the response
        UserResponse.Builder response;

        if(found){
            // Remove the user from the list
            users.remove(position); 
            response = UserResponse.newBuilder();
            response.setMessage("user " + user.getId() + " removed");           
        }else{
            // Handle the case where the user is not found
            response = UserResponse.newBuilder();
            response.setMessage("user not found");  
        }
        
        // Send the response to the client
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(Empty request, StreamObserver<UserResponse> responseObserver){
        // Iterate through the list of users and send each one to the client
        for (User user : users) {
            UserResponse response = UserResponse.newBuilder().
            setMessage(user.toString()).build();
            responseObserver.onNext(response);
        }
        // Complete the RPC call after all users have been sent
        responseObserver.onCompleted();
    }
}

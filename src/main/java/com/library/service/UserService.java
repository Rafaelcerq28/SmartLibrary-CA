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
        
        System.out.println("Chamada add user");
        
        int userId = users.size();
        String userName = request.getName();
        String userPhone = request.getPhone();
        String userAddress = request.getAddress();

        //Testing users in the arrayList
        User user = new User(userId, userName, userPhone, userAddress);

        users.add(user);
        System.out.println(users.toString());
        //end tests 

        UserResponse.Builder response = UserResponse.newBuilder();

        response.setMessage(user.toString());

        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();

        
    }

    @Override
    public void removeUsers(UserRequest request, StreamObserver<UserResponse> responseObserver){
        System.out.println("chamando o metodo removeUser");
        //Store the user in an user object
        int userId = request.getUserId();
        User user = new User(userId, "null", "null", "null");

        //Search for the user in the list
        int position = 0;
        boolean found = false;
        for(User userToRemove:users){
            if(userToRemove.getId() == user.getId()){
                found = true;
                break;
            }
            position++;
        }

        //remove the user and create a response
        UserResponse.Builder response;

        if(found){
            users.remove(position); 
            response = UserResponse.newBuilder();
            response.setMessage("user " + user.getId() + " removed");           
        }else{
            response = UserResponse.newBuilder();
            response.setMessage("user not found");  
        }
        
        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(Empty request, StreamObserver<UserResponse> responseObserver){
        
        for (User user : users) {
            UserResponse response = UserResponse.newBuilder().
            setMessage(user.toString()).build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }



    
}

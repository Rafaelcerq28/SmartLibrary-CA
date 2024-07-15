package com.library.service;

import com.grpcfiles.UserManagementGrpc.UserManagementImplBase;
import com.grpcfiles.UserOuterClass.UserRequest;
import com.grpcfiles.UserOuterClass.UserResponse;

import io.grpc.stub.StreamObserver;

public class UserService extends UserManagementImplBase{

    @Override
    public void addUser(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        
        System.out.println("Chamada add user");
        
        int userId = request.getUserId();
        String userName = request.getName();

        UserResponse.Builder response = UserResponse.newBuilder();

        response.setMessage(userName);

        responseObserver.onNext(response.build());
        //fecha a chamada
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.getUsers(request, responseObserver);
    }

    @Override
    public StreamObserver<UserRequest> removeUsers(StreamObserver<UserResponse> responseObserver) {
        // TODO Auto-generated method stub
        return super.removeUsers(responseObserver);
    }


    
}

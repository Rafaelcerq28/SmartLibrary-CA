package smartlibrary;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Serviço de Gerenciamento de Usuários
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: library.proto")
public final class UserManagementGrpc {

  private UserManagementGrpc() {}

  public static final String SERVICE_NAME = "smartlibrary.UserManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartlibrary.Library.UserRequest,
      smartlibrary.Library.UserResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = smartlibrary.Library.UserRequest.class,
      responseType = smartlibrary.Library.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartlibrary.Library.UserRequest,
      smartlibrary.Library.UserResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<smartlibrary.Library.UserRequest, smartlibrary.Library.UserResponse> getAddUserMethod;
    if ((getAddUserMethod = UserManagementGrpc.getAddUserMethod) == null) {
      synchronized (UserManagementGrpc.class) {
        if ((getAddUserMethod = UserManagementGrpc.getAddUserMethod) == null) {
          UserManagementGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<smartlibrary.Library.UserRequest, smartlibrary.Library.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartlibrary.UserManagement", "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagementMethodDescriptorSupplier("AddUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartlibrary.Library.UserRequest,
      smartlibrary.Library.UserResponse> getRemoveUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUsers",
      requestType = smartlibrary.Library.UserRequest.class,
      responseType = smartlibrary.Library.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<smartlibrary.Library.UserRequest,
      smartlibrary.Library.UserResponse> getRemoveUsersMethod() {
    io.grpc.MethodDescriptor<smartlibrary.Library.UserRequest, smartlibrary.Library.UserResponse> getRemoveUsersMethod;
    if ((getRemoveUsersMethod = UserManagementGrpc.getRemoveUsersMethod) == null) {
      synchronized (UserManagementGrpc.class) {
        if ((getRemoveUsersMethod = UserManagementGrpc.getRemoveUsersMethod) == null) {
          UserManagementGrpc.getRemoveUsersMethod = getRemoveUsersMethod = 
              io.grpc.MethodDescriptor.<smartlibrary.Library.UserRequest, smartlibrary.Library.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartlibrary.UserManagement", "RemoveUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagementMethodDescriptorSupplier("RemoveUsers"))
                  .build();
          }
        }
     }
     return getRemoveUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserManagementStub newStub(io.grpc.Channel channel) {
    return new UserManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserManagementFutureStub(channel);
  }

  /**
   * <pre>
   * Serviço de Gerenciamento de Usuários
   * </pre>
   */
  public static abstract class UserManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void addUser(smartlibrary.Library.UserRequest request,
        io.grpc.stub.StreamObserver<smartlibrary.Library.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<smartlibrary.Library.UserRequest> removeUsers(
        io.grpc.stub.StreamObserver<smartlibrary.Library.UserResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRemoveUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartlibrary.Library.UserRequest,
                smartlibrary.Library.UserResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getRemoveUsersMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                smartlibrary.Library.UserRequest,
                smartlibrary.Library.UserResponse>(
                  this, METHODID_REMOVE_USERS)))
          .build();
    }
  }

  /**
   * <pre>
   * Serviço de Gerenciamento de Usuários
   * </pre>
   */
  public static final class UserManagementStub extends io.grpc.stub.AbstractStub<UserManagementStub> {
    private UserManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void addUser(smartlibrary.Library.UserRequest request,
        io.grpc.stub.StreamObserver<smartlibrary.Library.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<smartlibrary.Library.UserRequest> removeUsers(
        io.grpc.stub.StreamObserver<smartlibrary.Library.UserResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRemoveUsersMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Serviço de Gerenciamento de Usuários
   * </pre>
   */
  public static final class UserManagementBlockingStub extends io.grpc.stub.AbstractStub<UserManagementBlockingStub> {
    private UserManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public smartlibrary.Library.UserResponse addUser(smartlibrary.Library.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Serviço de Gerenciamento de Usuários
   * </pre>
   */
  public static final class UserManagementFutureStub extends io.grpc.stub.AbstractStub<UserManagementFutureStub> {
    private UserManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<smartlibrary.Library.UserResponse> addUser(
        smartlibrary.Library.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_REMOVE_USERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((smartlibrary.Library.UserRequest) request,
              (io.grpc.stub.StreamObserver<smartlibrary.Library.UserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE_USERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.removeUsers(
              (io.grpc.stub.StreamObserver<smartlibrary.Library.UserResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smartlibrary.Library.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserManagement");
    }
  }

  private static final class UserManagementFileDescriptorSupplier
      extends UserManagementBaseDescriptorSupplier {
    UserManagementFileDescriptorSupplier() {}
  }

  private static final class UserManagementMethodDescriptorSupplier
      extends UserManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserManagementMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserManagementFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getRemoveUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}

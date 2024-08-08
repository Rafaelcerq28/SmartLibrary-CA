package com.grpcfiles;

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
 * Serviço de Empréstimo de Livros
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: loan.proto")
public final class LoanManagementGrpc {

  private LoanManagementGrpc() {}

  public static final String SERVICE_NAME = "com.grpcfiles.LoanManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcfiles.Loan.LoanRequest,
      com.grpcfiles.Loan.LoanResponse> getBorrowBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BorrowBook",
      requestType = com.grpcfiles.Loan.LoanRequest.class,
      responseType = com.grpcfiles.Loan.LoanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcfiles.Loan.LoanRequest,
      com.grpcfiles.Loan.LoanResponse> getBorrowBookMethod() {
    io.grpc.MethodDescriptor<com.grpcfiles.Loan.LoanRequest, com.grpcfiles.Loan.LoanResponse> getBorrowBookMethod;
    if ((getBorrowBookMethod = LoanManagementGrpc.getBorrowBookMethod) == null) {
      synchronized (LoanManagementGrpc.class) {
        if ((getBorrowBookMethod = LoanManagementGrpc.getBorrowBookMethod) == null) {
          LoanManagementGrpc.getBorrowBookMethod = getBorrowBookMethod = 
              io.grpc.MethodDescriptor.<com.grpcfiles.Loan.LoanRequest, com.grpcfiles.Loan.LoanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpcfiles.LoanManagement", "BorrowBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.Loan.LoanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.Loan.LoanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoanManagementMethodDescriptorSupplier("BorrowBook"))
                  .build();
          }
        }
     }
     return getBorrowBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcfiles.Loan.LoanRequest,
      com.grpcfiles.Loan.LoanResponse> getReturnBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReturnBook",
      requestType = com.grpcfiles.Loan.LoanRequest.class,
      responseType = com.grpcfiles.Loan.LoanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcfiles.Loan.LoanRequest,
      com.grpcfiles.Loan.LoanResponse> getReturnBookMethod() {
    io.grpc.MethodDescriptor<com.grpcfiles.Loan.LoanRequest, com.grpcfiles.Loan.LoanResponse> getReturnBookMethod;
    if ((getReturnBookMethod = LoanManagementGrpc.getReturnBookMethod) == null) {
      synchronized (LoanManagementGrpc.class) {
        if ((getReturnBookMethod = LoanManagementGrpc.getReturnBookMethod) == null) {
          LoanManagementGrpc.getReturnBookMethod = getReturnBookMethod = 
              io.grpc.MethodDescriptor.<com.grpcfiles.Loan.LoanRequest, com.grpcfiles.Loan.LoanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpcfiles.LoanManagement", "ReturnBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.Loan.LoanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.Loan.LoanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LoanManagementMethodDescriptorSupplier("ReturnBook"))
                  .build();
          }
        }
     }
     return getReturnBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoanManagementStub newStub(io.grpc.Channel channel) {
    return new LoanManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoanManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoanManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoanManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoanManagementFutureStub(channel);
  }

  /**
   * <pre>
   * Serviço de Empréstimo de Livros
   * </pre>
   */
  public static abstract class LoanManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void borrowBook(com.grpcfiles.Loan.LoanRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.Loan.LoanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBorrowBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void returnBook(com.grpcfiles.Loan.LoanRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.Loan.LoanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReturnBookMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBorrowBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcfiles.Loan.LoanRequest,
                com.grpcfiles.Loan.LoanResponse>(
                  this, METHODID_BORROW_BOOK)))
          .addMethod(
            getReturnBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcfiles.Loan.LoanRequest,
                com.grpcfiles.Loan.LoanResponse>(
                  this, METHODID_RETURN_BOOK)))
          .build();
    }
  }

  /**
   * <pre>
   * Serviço de Empréstimo de Livros
   * </pre>
   */
  public static final class LoanManagementStub extends io.grpc.stub.AbstractStub<LoanManagementStub> {
    private LoanManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoanManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoanManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoanManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void borrowBook(com.grpcfiles.Loan.LoanRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.Loan.LoanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBorrowBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void returnBook(com.grpcfiles.Loan.LoanRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.Loan.LoanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReturnBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Serviço de Empréstimo de Livros
   * </pre>
   */
  public static final class LoanManagementBlockingStub extends io.grpc.stub.AbstractStub<LoanManagementBlockingStub> {
    private LoanManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoanManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoanManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoanManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.grpcfiles.Loan.LoanResponse borrowBook(com.grpcfiles.Loan.LoanRequest request) {
      return blockingUnaryCall(
          getChannel(), getBorrowBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.grpcfiles.Loan.LoanResponse returnBook(com.grpcfiles.Loan.LoanRequest request) {
      return blockingUnaryCall(
          getChannel(), getReturnBookMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Serviço de Empréstimo de Livros
   * </pre>
   */
  public static final class LoanManagementFutureStub extends io.grpc.stub.AbstractStub<LoanManagementFutureStub> {
    private LoanManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoanManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoanManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoanManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcfiles.Loan.LoanResponse> borrowBook(
        com.grpcfiles.Loan.LoanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBorrowBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcfiles.Loan.LoanResponse> returnBook(
        com.grpcfiles.Loan.LoanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReturnBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BORROW_BOOK = 0;
  private static final int METHODID_RETURN_BOOK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoanManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoanManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BORROW_BOOK:
          serviceImpl.borrowBook((com.grpcfiles.Loan.LoanRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcfiles.Loan.LoanResponse>) responseObserver);
          break;
        case METHODID_RETURN_BOOK:
          serviceImpl.returnBook((com.grpcfiles.Loan.LoanRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcfiles.Loan.LoanResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LoanManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoanManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcfiles.Loan.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoanManagement");
    }
  }

  private static final class LoanManagementFileDescriptorSupplier
      extends LoanManagementBaseDescriptorSupplier {
    LoanManagementFileDescriptorSupplier() {}
  }

  private static final class LoanManagementMethodDescriptorSupplier
      extends LoanManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoanManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoanManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoanManagementFileDescriptorSupplier())
              .addMethod(getBorrowBookMethod())
              .addMethod(getReturnBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: book.proto")
public final class BookManagementGrpc {

  private BookManagementGrpc() {}

  public static final String SERVICE_NAME = "com.grpcfiles.BookManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookRequest,
      com.grpcfiles.BookOuterClass.BookResponse> getAddBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBook",
      requestType = com.grpcfiles.BookOuterClass.BookRequest.class,
      responseType = com.grpcfiles.BookOuterClass.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookRequest,
      com.grpcfiles.BookOuterClass.BookResponse> getAddBookMethod() {
    io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookRequest, com.grpcfiles.BookOuterClass.BookResponse> getAddBookMethod;
    if ((getAddBookMethod = BookManagementGrpc.getAddBookMethod) == null) {
      synchronized (BookManagementGrpc.class) {
        if ((getAddBookMethod = BookManagementGrpc.getAddBookMethod) == null) {
          BookManagementGrpc.getAddBookMethod = getAddBookMethod = 
              io.grpc.MethodDescriptor.<com.grpcfiles.BookOuterClass.BookRequest, com.grpcfiles.BookOuterClass.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpcfiles.BookManagement", "AddBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookManagementMethodDescriptorSupplier("AddBook"))
                  .build();
          }
        }
     }
     return getAddBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookRequest,
      com.grpcfiles.BookOuterClass.BookResponse> getRemoveBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveBook",
      requestType = com.grpcfiles.BookOuterClass.BookRequest.class,
      responseType = com.grpcfiles.BookOuterClass.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookRequest,
      com.grpcfiles.BookOuterClass.BookResponse> getRemoveBookMethod() {
    io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookRequest, com.grpcfiles.BookOuterClass.BookResponse> getRemoveBookMethod;
    if ((getRemoveBookMethod = BookManagementGrpc.getRemoveBookMethod) == null) {
      synchronized (BookManagementGrpc.class) {
        if ((getRemoveBookMethod = BookManagementGrpc.getRemoveBookMethod) == null) {
          BookManagementGrpc.getRemoveBookMethod = getRemoveBookMethod = 
              io.grpc.MethodDescriptor.<com.grpcfiles.BookOuterClass.BookRequest, com.grpcfiles.BookOuterClass.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpcfiles.BookManagement", "RemoveBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookManagementMethodDescriptorSupplier("RemoveBook"))
                  .build();
          }
        }
     }
     return getRemoveBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookStatusRequest,
      com.grpcfiles.BookOuterClass.BookResponse> getBookTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookTransaction",
      requestType = com.grpcfiles.BookOuterClass.BookStatusRequest.class,
      responseType = com.grpcfiles.BookOuterClass.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookStatusRequest,
      com.grpcfiles.BookOuterClass.BookResponse> getBookTransactionMethod() {
    io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.BookStatusRequest, com.grpcfiles.BookOuterClass.BookResponse> getBookTransactionMethod;
    if ((getBookTransactionMethod = BookManagementGrpc.getBookTransactionMethod) == null) {
      synchronized (BookManagementGrpc.class) {
        if ((getBookTransactionMethod = BookManagementGrpc.getBookTransactionMethod) == null) {
          BookManagementGrpc.getBookTransactionMethod = getBookTransactionMethod = 
              io.grpc.MethodDescriptor.<com.grpcfiles.BookOuterClass.BookStatusRequest, com.grpcfiles.BookOuterClass.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpcfiles.BookManagement", "BookTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.BookStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookManagementMethodDescriptorSupplier("BookTransaction"))
                  .build();
          }
        }
     }
     return getBookTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.Empty,
      com.grpcfiles.BookOuterClass.BookResponse> getListBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBooks",
      requestType = com.grpcfiles.BookOuterClass.Empty.class,
      responseType = com.grpcfiles.BookOuterClass.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.Empty,
      com.grpcfiles.BookOuterClass.BookResponse> getListBooksMethod() {
    io.grpc.MethodDescriptor<com.grpcfiles.BookOuterClass.Empty, com.grpcfiles.BookOuterClass.BookResponse> getListBooksMethod;
    if ((getListBooksMethod = BookManagementGrpc.getListBooksMethod) == null) {
      synchronized (BookManagementGrpc.class) {
        if ((getListBooksMethod = BookManagementGrpc.getListBooksMethod) == null) {
          BookManagementGrpc.getListBooksMethod = getListBooksMethod = 
              io.grpc.MethodDescriptor.<com.grpcfiles.BookOuterClass.Empty, com.grpcfiles.BookOuterClass.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.grpcfiles.BookManagement", "ListBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcfiles.BookOuterClass.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookManagementMethodDescriptorSupplier("ListBooks"))
                  .build();
          }
        }
     }
     return getListBooksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookManagementStub newStub(io.grpc.Channel channel) {
    return new BookManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookManagementFutureStub(channel);
  }

  /**
   */
  public static abstract class BookManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void addBook(com.grpcfiles.BookOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    /**
     * <pre>
     *RPC to remove a book
     * </pre>
     */
    public void removeBook(com.grpcfiles.BookOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveBookMethod(), responseObserver);
    }

    /**
     * <pre>
     *Simple RPC to change the book status (borrowed or not)
     * </pre>
     */
    public void bookTransaction(com.grpcfiles.BookOuterClass.BookStatusRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * RPC to list all books (server-side streaming)
     * </pre>
     */
    public void listBooks(com.grpcfiles.BookOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListBooksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcfiles.BookOuterClass.BookRequest,
                com.grpcfiles.BookOuterClass.BookResponse>(
                  this, METHODID_ADD_BOOK)))
          .addMethod(
            getRemoveBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcfiles.BookOuterClass.BookRequest,
                com.grpcfiles.BookOuterClass.BookResponse>(
                  this, METHODID_REMOVE_BOOK)))
          .addMethod(
            getBookTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcfiles.BookOuterClass.BookStatusRequest,
                com.grpcfiles.BookOuterClass.BookResponse>(
                  this, METHODID_BOOK_TRANSACTION)))
          .addMethod(
            getListBooksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.grpcfiles.BookOuterClass.Empty,
                com.grpcfiles.BookOuterClass.BookResponse>(
                  this, METHODID_LIST_BOOKS)))
          .build();
    }
  }

  /**
   */
  public static final class BookManagementStub extends io.grpc.stub.AbstractStub<BookManagementStub> {
    private BookManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void addBook(com.grpcfiles.BookOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *RPC to remove a book
     * </pre>
     */
    public void removeBook(com.grpcfiles.BookOuterClass.BookRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Simple RPC to change the book status (borrowed or not)
     * </pre>
     */
    public void bookTransaction(com.grpcfiles.BookOuterClass.BookStatusRequest request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RPC to list all books (server-side streaming)
     * </pre>
     */
    public void listBooks(com.grpcfiles.BookOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListBooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookManagementBlockingStub extends io.grpc.stub.AbstractStub<BookManagementBlockingStub> {
    private BookManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.grpcfiles.BookOuterClass.BookResponse addBook(com.grpcfiles.BookOuterClass.BookRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *RPC to remove a book
     * </pre>
     */
    public com.grpcfiles.BookOuterClass.BookResponse removeBook(com.grpcfiles.BookOuterClass.BookRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Simple RPC to change the book status (borrowed or not)
     * </pre>
     */
    public com.grpcfiles.BookOuterClass.BookResponse bookTransaction(com.grpcfiles.BookOuterClass.BookStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RPC to list all books (server-side streaming)
     * </pre>
     */
    public java.util.Iterator<com.grpcfiles.BookOuterClass.BookResponse> listBooks(
        com.grpcfiles.BookOuterClass.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListBooksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookManagementFutureStub extends io.grpc.stub.AbstractStub<BookManagementFutureStub> {
    private BookManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcfiles.BookOuterClass.BookResponse> addBook(
        com.grpcfiles.BookOuterClass.BookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *RPC to remove a book
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcfiles.BookOuterClass.BookResponse> removeBook(
        com.grpcfiles.BookOuterClass.BookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Simple RPC to change the book status (borrowed or not)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcfiles.BookOuterClass.BookResponse> bookTransaction(
        com.grpcfiles.BookOuterClass.BookStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BOOK = 0;
  private static final int METHODID_REMOVE_BOOK = 1;
  private static final int METHODID_BOOK_TRANSACTION = 2;
  private static final int METHODID_LIST_BOOKS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BOOK:
          serviceImpl.addBook((com.grpcfiles.BookOuterClass.BookRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse>) responseObserver);
          break;
        case METHODID_REMOVE_BOOK:
          serviceImpl.removeBook((com.grpcfiles.BookOuterClass.BookRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse>) responseObserver);
          break;
        case METHODID_BOOK_TRANSACTION:
          serviceImpl.bookTransaction((com.grpcfiles.BookOuterClass.BookStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse>) responseObserver);
          break;
        case METHODID_LIST_BOOKS:
          serviceImpl.listBooks((com.grpcfiles.BookOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.grpcfiles.BookOuterClass.BookResponse>) responseObserver);
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

  private static abstract class BookManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcfiles.BookOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookManagement");
    }
  }

  private static final class BookManagementFileDescriptorSupplier
      extends BookManagementBaseDescriptorSupplier {
    BookManagementFileDescriptorSupplier() {}
  }

  private static final class BookManagementMethodDescriptorSupplier
      extends BookManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookManagementFileDescriptorSupplier())
              .addMethod(getAddBookMethod())
              .addMethod(getRemoveBookMethod())
              .addMethod(getBookTransactionMethod())
              .addMethod(getListBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}

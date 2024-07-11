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
 * Serviço de Gerenciamento de Livros
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: library.proto")
public final class BookManagementGrpc {

  private BookManagementGrpc() {}

  public static final String SERVICE_NAME = "smartlibrary.BookManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smartlibrary.Library.BookRequest,
      smartlibrary.Library.BookResponse> getAddBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddBook",
      requestType = smartlibrary.Library.BookRequest.class,
      responseType = smartlibrary.Library.BookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smartlibrary.Library.BookRequest,
      smartlibrary.Library.BookResponse> getAddBookMethod() {
    io.grpc.MethodDescriptor<smartlibrary.Library.BookRequest, smartlibrary.Library.BookResponse> getAddBookMethod;
    if ((getAddBookMethod = BookManagementGrpc.getAddBookMethod) == null) {
      synchronized (BookManagementGrpc.class) {
        if ((getAddBookMethod = BookManagementGrpc.getAddBookMethod) == null) {
          BookManagementGrpc.getAddBookMethod = getAddBookMethod = 
              io.grpc.MethodDescriptor.<smartlibrary.Library.BookRequest, smartlibrary.Library.BookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartlibrary.BookManagement", "AddBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.BookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.BookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookManagementMethodDescriptorSupplier("AddBook"))
                  .build();
          }
        }
     }
     return getAddBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smartlibrary.Library.Empty,
      smartlibrary.Library.Book> getListBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBooks",
      requestType = smartlibrary.Library.Empty.class,
      responseType = smartlibrary.Library.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smartlibrary.Library.Empty,
      smartlibrary.Library.Book> getListBooksMethod() {
    io.grpc.MethodDescriptor<smartlibrary.Library.Empty, smartlibrary.Library.Book> getListBooksMethod;
    if ((getListBooksMethod = BookManagementGrpc.getListBooksMethod) == null) {
      synchronized (BookManagementGrpc.class) {
        if ((getListBooksMethod = BookManagementGrpc.getListBooksMethod) == null) {
          BookManagementGrpc.getListBooksMethod = getListBooksMethod = 
              io.grpc.MethodDescriptor.<smartlibrary.Library.Empty, smartlibrary.Library.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartlibrary.BookManagement", "ListBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smartlibrary.Library.Book.getDefaultInstance()))
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
   * <pre>
   * Serviço de Gerenciamento de Livros
   * </pre>
   */
  public static abstract class BookManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simple RPC
     * </pre>
     */
    public void addBook(smartlibrary.Library.BookRequest request,
        io.grpc.stub.StreamObserver<smartlibrary.Library.BookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC
     * </pre>
     */
    public void listBooks(smartlibrary.Library.Empty request,
        io.grpc.stub.StreamObserver<smartlibrary.Library.Book> responseObserver) {
      asyncUnimplementedUnaryCall(getListBooksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                smartlibrary.Library.BookRequest,
                smartlibrary.Library.BookResponse>(
                  this, METHODID_ADD_BOOK)))
          .addMethod(
            getListBooksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                smartlibrary.Library.Empty,
                smartlibrary.Library.Book>(
                  this, METHODID_LIST_BOOKS)))
          .build();
    }
  }

  /**
   * <pre>
   * Serviço de Gerenciamento de Livros
   * </pre>
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
    public void addBook(smartlibrary.Library.BookRequest request,
        io.grpc.stub.StreamObserver<smartlibrary.Library.BookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server-side Streaming RPC
     * </pre>
     */
    public void listBooks(smartlibrary.Library.Empty request,
        io.grpc.stub.StreamObserver<smartlibrary.Library.Book> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListBooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Serviço de Gerenciamento de Livros
   * </pre>
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
    public smartlibrary.Library.BookResponse addBook(smartlibrary.Library.BookRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server-side Streaming RPC
     * </pre>
     */
    public java.util.Iterator<smartlibrary.Library.Book> listBooks(
        smartlibrary.Library.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListBooksMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Serviço de Gerenciamento de Livros
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<smartlibrary.Library.BookResponse> addBook(
        smartlibrary.Library.BookRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BOOK = 0;
  private static final int METHODID_LIST_BOOKS = 1;

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
          serviceImpl.addBook((smartlibrary.Library.BookRequest) request,
              (io.grpc.stub.StreamObserver<smartlibrary.Library.BookResponse>) responseObserver);
          break;
        case METHODID_LIST_BOOKS:
          serviceImpl.listBooks((smartlibrary.Library.Empty) request,
              (io.grpc.stub.StreamObserver<smartlibrary.Library.Book>) responseObserver);
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
      return smartlibrary.Library.getDescriptor();
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
              .addMethod(getListBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}

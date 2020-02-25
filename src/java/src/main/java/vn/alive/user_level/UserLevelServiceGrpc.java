package vn.alive.user_level;

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
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: user-level/v1/user-level.proto")
public final class UserLevelServiceGrpc {

  private UserLevelServiceGrpc() {}

  public static final String SERVICE_NAME = "user_level.v1.UserLevelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vn.alive.user_level.UserLevel.StringMessage,
      vn.alive.user_level.UserLevel.StringMessage> getGetUserLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserLevel",
      requestType = vn.alive.user_level.UserLevel.StringMessage.class,
      responseType = vn.alive.user_level.UserLevel.StringMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vn.alive.user_level.UserLevel.StringMessage,
      vn.alive.user_level.UserLevel.StringMessage> getGetUserLevelMethod() {
    io.grpc.MethodDescriptor<vn.alive.user_level.UserLevel.StringMessage, vn.alive.user_level.UserLevel.StringMessage> getGetUserLevelMethod;
    if ((getGetUserLevelMethod = UserLevelServiceGrpc.getGetUserLevelMethod) == null) {
      synchronized (UserLevelServiceGrpc.class) {
        if ((getGetUserLevelMethod = UserLevelServiceGrpc.getGetUserLevelMethod) == null) {
          UserLevelServiceGrpc.getGetUserLevelMethod = getGetUserLevelMethod =
              io.grpc.MethodDescriptor.<vn.alive.user_level.UserLevel.StringMessage, vn.alive.user_level.UserLevel.StringMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.alive.user_level.UserLevel.StringMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vn.alive.user_level.UserLevel.StringMessage.getDefaultInstance()))
              .setSchemaDescriptor(new UserLevelServiceMethodDescriptorSupplier("GetUserLevel"))
              .build();
        }
      }
    }
    return getGetUserLevelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserLevelServiceStub newStub(io.grpc.Channel channel) {
    return new UserLevelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserLevelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserLevelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserLevelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserLevelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserLevelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserLevel(vn.alive.user_level.UserLevel.StringMessage request,
        io.grpc.stub.StreamObserver<vn.alive.user_level.UserLevel.StringMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserLevelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                vn.alive.user_level.UserLevel.StringMessage,
                vn.alive.user_level.UserLevel.StringMessage>(
                  this, METHODID_GET_USER_LEVEL)))
          .build();
    }
  }

  /**
   */
  public static final class UserLevelServiceStub extends io.grpc.stub.AbstractStub<UserLevelServiceStub> {
    private UserLevelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLevelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLevelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLevelServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserLevel(vn.alive.user_level.UserLevel.StringMessage request,
        io.grpc.stub.StreamObserver<vn.alive.user_level.UserLevel.StringMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserLevelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserLevelServiceBlockingStub extends io.grpc.stub.AbstractStub<UserLevelServiceBlockingStub> {
    private UserLevelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLevelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLevelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLevelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public vn.alive.user_level.UserLevel.StringMessage getUserLevel(vn.alive.user_level.UserLevel.StringMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetUserLevelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserLevelServiceFutureStub extends io.grpc.stub.AbstractStub<UserLevelServiceFutureStub> {
    private UserLevelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserLevelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserLevelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserLevelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<vn.alive.user_level.UserLevel.StringMessage> getUserLevel(
        vn.alive.user_level.UserLevel.StringMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_LEVEL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserLevelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserLevelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_LEVEL:
          serviceImpl.getUserLevel((vn.alive.user_level.UserLevel.StringMessage) request,
              (io.grpc.stub.StreamObserver<vn.alive.user_level.UserLevel.StringMessage>) responseObserver);
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

  private static abstract class UserLevelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserLevelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return vn.alive.user_level.UserLevel.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserLevelService");
    }
  }

  private static final class UserLevelServiceFileDescriptorSupplier
      extends UserLevelServiceBaseDescriptorSupplier {
    UserLevelServiceFileDescriptorSupplier() {}
  }

  private static final class UserLevelServiceMethodDescriptorSupplier
      extends UserLevelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserLevelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserLevelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserLevelServiceFileDescriptorSupplier())
              .addMethod(getGetUserLevelMethod())
              .build();
        }
      }
    }
    return result;
  }
}

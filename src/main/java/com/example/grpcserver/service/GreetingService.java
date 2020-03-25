package com.example.grpcserver.service;

import com.example.greeting.GreeterGrpc;
import com.example.greeting.HelloReply;
import com.example.greeting.HelloRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class GreetingService extends GreeterGrpc.GreeterImplBase
{
    Logger logger = LoggerFactory.getLogger(GreetingService.class);

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        logger.info("Receiving request with name {}", request.getName());
        String replyString = String.format("Hi there, %s !", request.getName());
        HelloReply reply = HelloReply.newBuilder().setReply(replyString).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}

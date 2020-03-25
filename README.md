# Basic Spring Boot Server configured as GRPC Server

### Reference Documentation
For further reference, please consider the following sections:
* [Spring Boot Documentation](https://spring.io/projects/spring-boot)
* [gRPC Basic Reference Guide](https://grpc.io/docs/tutorials/basic/java/)
* [gRPC Java Implementation](https://github.com/grpc/grpc-java)

### How to Run
* Pull down repository.
* Run command "mvn compile".
* Allow your IDE to index new files.
* Check service class to ensure imports have resolved.
* Run from main method in GrpcServerApplication class.
* In your browser, navigate to localhost:8080/returnData to ensure webserver is up and running.

### Notes
* Current POM build cycle involves the creation of docker images from the build artifacts.
* Running a maven install will also attempt to create a docker image, which will only be possible if a local docker daemon is present.
* If you're having issues with key/cert authentication, change value in application.properties from:
    * "grpc.server.security.enabled=true" to "grpc.server.security.enabled=false".


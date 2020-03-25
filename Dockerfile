FROM openjdk:9

EXPOSE 8080
EXPOSE 8181

COPY target/grpc-server.jar /app/server.jar
COPY target/classes/certs /app/certs
COPY target/classes/container.properties /app/application.properties

CMD ["java", "-jar", "-Dgrpc.server.port=8181", "/app/server.jar", "--spring.config.location=/app/application.properties"]
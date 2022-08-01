FROM openjdk:11.0.7-jdk-slim
WORKDIR /src
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/servicedb-0.0.1-SNAPSHOT.jar"]
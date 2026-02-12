# springboot-helloworld

This repository creates a Hello World Spring Boot application with Actuator and a Docker image.
This is useful for learning new technologies that require a Spring Boot project and an image.

Tested with JDK 25, Spring Boot 4.0.2, and Gradle 9.3

# Run application

% git clone <http_repo>

% ./gradlew clean build

% ./gradlew bootRun

% curl http://localhost:8080/actuator/health

# Run Docker

% docker build -t springboot-helloworld:latest .
% docker run -p 8080:8080 springboot-helloworld:latest

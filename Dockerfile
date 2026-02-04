# Use an official OpenJDK runtime as a base image
FROM eclipse-temurin:25-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
# Update 'your-application-name.jar' with the actual name of your generated JAR file
COPY build/libs/*.jar app.jar

# Expose the port your Spring Boot app runs on (default is 8080)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
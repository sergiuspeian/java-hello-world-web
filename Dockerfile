# Use Eclipse Temurin OpenJDK 17 runtime (recommended replacement)
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the pre-built JAR file (built by Jenkins)
COPY ./target/java-hello-world-web*.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]

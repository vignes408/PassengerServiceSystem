FROM openjdk:18
WORKDIR /app
COPY ./target/Passenger_Service-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Passenger_Service-0.0.1-SNAPSHOT.jar"]

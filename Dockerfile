#
# Build stage
#
FROM maven:3.3.0-jdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:21-jdk-slim
COPY --from=build /target/topjava-1.0-SNAPSHOT.jar topjava.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","topjava.jar"]
#docker build -t department-service .
#docker run --rm -p 8084:8084 department-service
#FROM openjdk:11-jdk-alpine
FROM adoptopenjdk/openjdk11:alpine-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
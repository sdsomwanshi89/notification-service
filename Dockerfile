FROM maven:3.6.3 AS maven
LABEL MAINTAINER="sdsomvanshi89@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN mvn package

# For Java 17,
FROM adoptopenjdk/openjdk17:alpine-jre
ARG JAR_FILE=notification-service-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app

COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

ENTRYPOINT ["java","-jar","notification-service-0.0.1-SNAPSHOT.jar"]
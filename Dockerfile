FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar /tmp/app.jar
ENTRYPOINT ["java","-jar","/tmp/app.jar"]
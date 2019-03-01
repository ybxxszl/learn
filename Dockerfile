FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} qs-gradle.jar
ENTRYPOINT ["java","-jar","/qs-gradle.jar","--spring.profiles.active=test"]

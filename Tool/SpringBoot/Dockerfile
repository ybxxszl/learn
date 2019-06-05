FROM docker.io/openjdk:8-jdk-alpine
LABEL name="wjy"
VOLUME /tmp
ADD timezone /etc/
ADD app.jar /
ENTRYPOINT ["java","-jar","/app.jar"]
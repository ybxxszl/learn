FROM docker.io/openjdk:8-jdk-alpine
LABEL name="wjy"
VOLUME /tmp
ADD timezone /etc/
ADD base.jar /
ADD runjar.sh /
ENTRYPOINT ["sh","/runjar.sh"]
FROM openjdk:17-jdk-slim
LABEL authors="vinodatwal"

WORKDIR /app

COPY target/embedded-infinispan-0.0.1-SNAPSHOT.jar /app/embedded-infinispan.jar

ENV JAVA_OPTS=""

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar embedded-infinispan.jar
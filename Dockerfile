FROM alpine:3.16

RUN apk add openjdk17
COPY target/info-service.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8080
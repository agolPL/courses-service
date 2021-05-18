FROM openjdk:11-jdk
MAINTAINER <andi@osec.pl>

COPY target/courses-service-0.0.1-SNAPSHOT.jar /app/service.jar

CMD ["java", "-jar", "/app/service.jar  "]

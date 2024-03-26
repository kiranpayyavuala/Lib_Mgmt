#FROM openjdk:8
#!/usr/bin/env bash
#MAINTAINED BY : KIRAN
FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD /target/librarymanagementsystem-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c "touch /app.jar"
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

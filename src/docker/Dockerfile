FROM openjdk:19-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "/idstar-0.0.1-SNAPSHOT.jar"]
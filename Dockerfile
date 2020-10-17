FROM openjdk:8-jdk-alpine
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/episen-sca-jag-backend*.jar /app/episen-sca-jag-backend.jar
ENTRYPOINT ["java", "-jar", "/app/episen-sca-jag-backend.jar"]
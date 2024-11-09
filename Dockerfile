FROM openjdk:17-jdk-alpine
COPY target/*.jar jobportal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jobportal-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080

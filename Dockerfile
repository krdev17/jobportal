FROM eclipse-temurin:17-jdk-alpine
COPY target/jobportal-0.0.1-SNAPSHOT.jar jobportal.jar
ENTRYPOINT ["java","-jar","-f","/jobportal.jar"]

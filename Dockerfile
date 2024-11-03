FROM eclipse-temurin:17-jdk-alpine
RAILWAY_VOLUME /tmp
COPY target/jobportal-0.0.1-SNAPSHOT.jar jobportal.jar
ENTRYPOINT ["java","-jar","/jobportal.jar"]
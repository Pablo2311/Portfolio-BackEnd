FROM amazoncorretto:17-alpine-jdk

COPY target/Backend-0.0.1-SNAPSHOT.jar Backend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/Backend-0.0.1-SNAPSHOT.jar"]

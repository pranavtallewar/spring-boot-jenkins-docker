FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker-1.0.jar spring-boot-docker-1.0.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-1.0.jar"]
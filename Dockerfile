FROM openjdk:21-slim
EXPOSE 8000
ADD target/spring-docker-image.jar spring-docker-image.jar
ENTRYPOINT ["java", "-jar", "/spring-docker-image.jar"]
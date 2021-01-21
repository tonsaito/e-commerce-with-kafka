FROM gradle:6.6.1-jdk11 AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test --no-daemon

FROM openjdk:11.0.4-jre-slim

ENV SERVER_PORT=8080
ADD . $SERVER_PORT

EXPOSE 8080
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/*.jar spring-boot-application.jar

CMD ["java","-jar","/app/spring-boot-application.jar"]
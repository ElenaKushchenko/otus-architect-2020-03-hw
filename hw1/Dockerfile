FROM maven:3.6.3-jdk-8 AS MAVEN_BUILD
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

FROM openjdk:8-jre-alpine
ENV PROJECT_DIR="/app"
WORKDIR $PROJECT_DIR
COPY --from=MAVEN_BUILD /build/target/hw1.jar $PROJECT_DIR/
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "hw1.jar"]

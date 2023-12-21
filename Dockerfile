FROM iits/jdk17-temurin
LABEL authors="ichunghui"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
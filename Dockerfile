FROM maven:3.9.9-eclipse-temurin-21 as builder
WORKDIR /app
COPY . /app/.
RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip=true

FROM eclipse-temurin:21

ARG PORT

WORKDIR /app
COPY --from=builder /app/target/*.jar /app/*.jar
EXPOSE ${PORT}
ENTRYPOINT ["java", "-jar", "/app/*.jar"]

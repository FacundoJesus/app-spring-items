FROM maven:3.9.11-eclipse-temurin-25 AS build

WORKDIR /app-items

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package -DskipTests


FROM eclipse-temurin:25-jdk-alpine

WORKDIR /app-items

COPY --from=build /app-items/target/app-items-0.0.1-SNAPSHOT.jar app-items.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app-items.jar"]
# edusubmit-discovery-server

Spring Boot 4.x Eureka Discovery Server for the EduSubmit microservices.

## Tech Stack

- Java 25
- Maven
- Spring Boot 4.x
- Spring Cloud Netflix Eureka Server
- Spring Cloud Config Client
- Spring Boot Actuator

## Package

`com.edusubmit.discoveryserver`

## Features

- Eureka Discovery Server on port `8761`
- Eureka dashboard exposed at `http://localhost:8761/`
- Does not register itself as Eureka client
- Integrates with Config Server (`http://localhost:8888`)
- Actuator health endpoint at `http://localhost:8761/actuator/health`

## Configuration Files

- `src/main/resources/application.yml` (runtime settings)
- `src/main/resources/bootstrap.yml` (early config-server bootstrap settings)

## Run

1. Ensure Java 25 and Maven are installed.
2. Start config server first (expected at `http://localhost:8888`).
3. Run from project root:

```bash
cd edusubmit-discovery-server
mvn spring-boot:run
```

## Build

```bash
cd edusubmit-discovery-server
mvn clean package
```

## Verify

- Eureka dashboard: `http://localhost:8761/`
- Health endpoint: `http://localhost:8761/actuator/health`
# edusubmit-discovery-server

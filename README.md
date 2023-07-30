# java-grpc-starter
![Build](https://github.com/rbento/java-grpc-starter/actions/workflows/gradle.yml/badge.svg)

A starter for plain gRPC/Java projects.

### Requirements

- [Gradle](https://gradle.org/releases/) 8.2.1
- [JDK 17](https://www.azul.com/downloads/?package=jdk#zulu) from Azul

### Build

```bash
./gradlew clean build
```

### Run

Server
```bash
./gradlew :server:run
```

Client
```bash
./gradlew :client:run
```

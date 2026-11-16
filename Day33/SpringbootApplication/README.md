# Day 33 — Spring Boot

# Overview
Today, I learned the fundamentals of Spring Boot and created my first Spring Boot application using Visual Studio Code (VS Code).

Spring Boot simplifies Spring application development by providing auto-configuration, starter dependencies, and embedded servers.

# Theory

# 1. Spring Boot
Spring Boot is a Java-based framework built on top of the Spring Framework. It simplifies the development of standalone, production-ready Spring applications.

Advantages:
- Reduces boilerplate configuration.
- Simplifies dependency management.
- Supports embedded servers.
- Provides auto-configuration.
- Makes application development faster.

# 2. Auto Configuration
Auto-configuration automatically configures the Spring application based on the dependencies available in the project.
For example, when Spring Web is added, Spring Boot automatically configures the web application components.

Annotation:
@SpringBootApplication

This annotation combines:
- `@Configuration`
- `@EnableAutoConfiguration`
- `@ComponentScan`

# 3. Starters
Starters are predefined dependency packages that simplify dependency management.
Some commonly used Spring Boot starters:

| Starter | Purpose |
|---|---|
| spring-boot-starter-web | Building REST APIs and web applications |
| spring-boot-starter-data-jpa | Database operations using JPA |
| spring-boot-starter-security | Application security |
| spring-boot-starter-validation | Input validation |
| spring-boot-starter-test | Testing applications |

# 4. Application Properties
The `application.properties` file is used to configure Spring Boot applications.

Location:
src/main/resources/application.properties

Example:

spring.application.name=SpringbootApplication
server.port=8080

Common properties:

| Property | Purpose |
|---|---|
| spring.application.name | Defines application name |
| server.port | Configures server port |
| spring.datasource.url | Database connection URL |
| spring.datasource.username | Database username |
| spring.datasource.password | Database password |

# 5. Embedded Server
Spring Boot provides embedded servers, so we don't need to install and configure an external server separately.
Common embedded servers:
- Tomcat
- Jetty
- Undertow

By default, Spring Boot Web applications use Apache Tomcat.
The application can be started using:

mvn spring-boot:run

# 6. Spring Boot Project Structure

SpringbootApplication
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.SpringbootApplication
│   │   │       ├── controller
│   │   │       └── SpringbootApplication.java
│   │   │
│   │   └── resources
│   │       ├── static
│   │       ├── templates
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── mvnw

Important files:

- `pom.xml`: Contains project dependencies and Maven configuration.
- Main application class: Entry point of the Spring Boot application.
- `application.properties`: Stores application configuration.
- `controller`: Contains REST API controllers.
- `resources`: Contains configuration files and static resources.

# Task done:
 Created Spring Boot application.
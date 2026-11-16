# Day 31 — Spring Framework Introduction

# Topics Covered :-
• Why Spring?
• Spring ecosystem
• IoC
• DI
• Bean
• ApplicationContext

# 1. Why Spring?

Spring is a Java framework used to develop enterprise-level applications.
It simplifies application development by providing:
* Inversion of Control (IoC).
* Dependency Injection (DI).
* Loose Coupling.
* Database Integration.
* Transaction Management.
* Web Application Development.
* Security.
* Easy Unit Testing.

Advantages of Spring:
* Reduces boilerplate code.
* Simplifies object management.
* Promotes loose coupling.
* Supports modular development.
* Provides integration with Hibernate, JDBC and other technologies.

# 2. Spring Ecosystem

The Spring ecosystem consists of different modules and projects that help developers build Java applications.

| Component       | Purpose                                           |
| --------------- | ------------------------------------------------- |
| Spring Core     | Provides IoC and DI                               |
| Spring MVC      | Develops web applications                         |
| Spring JDBC     | Simplifies JDBC operations                        |
| Spring ORM      | Integrates ORM frameworks                         |
| Spring Security | Provides authentication and authorization         |
| Spring AOP      | Handles cross-cutting concerns                    |
| Spring Data JPA | Simplifies database operations                    |
| Spring Boot     | Simplifies Spring application configuration       |
| Spring Cloud    | Supports distributed and cloud-based applications |

# 3. IoC (Inversion of Control)

IoC stands for Inversion of Control.
It is a design principle in which the responsibility of creating and managing objects is transferred from the programmer to the Spring IoC container.
Spring creates and manages the object.

Benefits of IoC:
* Reduces manual object creation.
* Promotes loose coupling.
* Simplifies object management.
* Improves maintainability.

# 4. DI (Dependency Injection)

DI stands for Dependency Injection.
It is a technique in which Spring provides the required dependencies to a class instead of the class creating those dependencies itself.

Types of Dependency Injection:
1. Constructor Injection
2. Setter Injection
3. Field Injection

Constructor Injection is generally preferred because it makes dependencies explicit and supports immutable fields.

# 5. Bean

A Bean is an object that is created, configured and managed by the Spring IoC container.
Spring provides annotations to identify classes as Spring-managed components.

**Important Annotations:**

| Annotation        | Purpose                                 |
| ----------------- | --------------------------------------- |
| `@Component`      | Marks a class as a Spring component     |
| `@Service`        | Marks a service-layer component         |
| `@Repository`     | Marks a data-access component           |
| `@Controller`     | Marks an MVC controller                 |
| `@RestController` | Marks a REST API controller             |
| `@Autowired`      | Requests automatic dependency injection |

Spring detects the annotation and manages the Engine object as a Bean through component scanning.

# 6. ApplicationContext

ApplicationContext is the central Spring container responsible for managing Spring Beans.
Its responsibilities include:
* Creating Beans.
* Managing Bean lifecycle.
* Injecting dependencies.
* Reading configuration.
* Providing Beans to application classes.

# IoC vs DI

| IoC                                           | DI                                        |
| --------------------------------------------- | ----------------------------------------- |
| Inversion of Control                          | Dependency Injection                      |
| Design principle                              | Technique                                 |
| Transfers object management control to Spring | Provides required dependencies to classes |
| Broader concept                               | One way to implement IoC                  |

# Spring vs Spring Boot

| Spring Framework                                  | Spring Boot                               |
| ------------------------------------------------- | ----------------------------------------- |
| Core Java application framework                   | Built on top of Spring                    |
| Traditional setups may require more configuration | Provides auto-configuration               |
| Offers IoC and DI                                 | Simplifies Spring application development |
| More manual configuration in traditional setups   | Provides starter dependencies             |

**Note:** Spring Boot does not replace Spring Framework. It simplifies working with Spring.

# Day 40 — API Documentation & Testing

# 1. Introduction

API Documentation and Testing are important parts of backend development.

- **API Testing** checks whether APIs work correctly.
- **Unit Testing** tests individual components or methods.
- **Integration Testing** checks whether multiple components work together.
- **JUnit** is a Java testing framework.
- **Mockito** is used to create mock objects during testing.
- **Swagger/OpenAPI** helps document and explore REST APIs.

These concepts help developers build reliable, maintainable, and well-documented applications.

# 2. API Testing

API Testing is the process of testing an application's API endpoints to verify that they work as expected.
It checks whether:
- API requests are processed correctly.
- API responses contain the expected data.
- HTTP status codes are correct.
- Invalid requests are handled properly.
- Authentication and authorization work correctly.

### Common API Testing Tools

- Postman
- Swagger UI
- REST Assured
- cURL

### Advantages

- Detects API errors.
- Verifies response data.
- Checks API performance and behavior.
- Improves application reliability.

## 3. Unit Testing

Unit Testing is the process of testing individual units of code independently.
A unit can be:
- A method.
- A class.
- A service component.
- A business logic function.

The main purpose is to verify that each component works correctly.

### Advantages

- Finds bugs early.
- Makes debugging easier.
- Improves code quality.
- Helps developers maintain applications.
- Verifies business logic independently.

## 4. Integration Testing

Integration Testing checks whether multiple components of an application work together correctly.

For example, in a Spring Boot application, integration testing may verify communication between:

- Controller
- Service
- Repository
- Database

### Unit Testing vs Integration Testing

| Unit Testing | Integration Testing |
|---|---|
| Tests individual components. | Tests multiple components together. |
| Usually isolates dependencies. | Uses real or test versions of dependencies. |
| Faster to execute. | Usually takes more time. |
| Example: Testing a service method with mocks. | Example: Testing an API with a database. |


## 5. JUnit

JUnit is a popular testing framework used in Java applications.

It helps developers write and execute automated tests.

Spring Boot projects commonly use JUnit 5 through Spring Boot's test starter.

### Important JUnit Annotations

| Annotation | Purpose |
|---|---|
| `@Test` | Marks a method as a test method. |
| `@BeforeEach` | Runs before every test method. |
| `@AfterEach` | Runs after every test method. |
| `@BeforeAll` | Runs once before all test methods in the test class. |
| `@AfterAll` | Runs once after all test methods in the test class. |
| `@DisplayName` | Provides a readable test name. |
| `@Disabled` | Temporarily disables a test. |

### Important Assertions

| Assertion | Purpose |
|---|---|
| `assertEquals()` | Checks whether two values are equal. |
| `assertNotEquals()` | Checks whether two values are different. |
| `assertTrue()` | Checks whether a condition is true. |
| `assertFalse()` | Checks whether a condition is false. |
| `assertNull()` | Checks whether a value is null. |
| `assertNotNull()` | Checks whether a value is not null. |
| `assertThrows()` | Checks whether an expected exception is thrown. |

## 6. Mockito

Mockito is a Java framework used to create mock objects for testing.

A mock object simulates the behavior of a real dependency.

Mockito is especially useful when testing service classes that depend on repositories or other services.

# Advantages

- Reduces dependency on external systems during unit testing.
- Makes testing faster.
- Helps isolate business logic.
- Allows developers to simulate different scenarios.


# 7. Swagger/OpenAPI

Swagger and OpenAPI are commonly used for REST API documentation.

**OpenAPI** is a specification that describes REST APIs.

**Swagger** is a collection of tools that work with the OpenAPI specification.

These tools help developers understand, document, and test API endpoints.

### Features

- Automatically generates API documentation.
- Displays available API endpoints.
- Shows request and response formats.
- Allows developers to test APIs through a browser.
- Supports API authentication documentation.

### Advantages

- Makes API documentation easier.
- Helps frontend and backend developers communicate.
- Allows API testing without manually creating every request in Postman.
- Improves API maintenance.

## 8. Difference Between JUnit and Mockito

| JUnit | Mockito |
|---|---|
| Testing framework. | Mocking framework. |
| Executes and organizes tests. | Creates mock objects. |
| Provides assertions. | Simulates dependencies. |
| Example: `@Test`. | Example: `@Mock`. |

JUnit and Mockito are commonly used together.

## 9. Difference Between Swagger and Postman

| Swagger UI | Postman |
|---|---|
| Mainly used for API documentation and exploration. | Mainly used for API testing and request management. |
| Uses OpenAPI specifications. | Supports manual and automated API testing workflows. |
| Displays API documentation. | Organizes requests into collections. |
| Allows interactive API testing. | Supports environments, scripts, and test assertions. |

Both tools are useful during backend development.

# Day 37 — Validation & Exception Handling

# 1. Introduction

In Spring Boot, Validation and Exception Handling help us build reliable and user-friendly REST APIs.
- **Validation** checks whether the incoming data is correct before processing it.
- **Exception Handling** manages errors and returns meaningful responses instead of showing unexpected application errors.


# 2. Bean Validation

Bean Validation is used to validate the data provided by users.

For example, when a user registers, we may want to ensure that:
- Name is not empty.
- Email has a valid format.
- Password has a minimum length.
- Required fields are not null.

Spring Boot supports Bean Validation through annotations.

# Important annotations

| Annotation | Purpose |
|---|---|
| `@NotNull` | Value must not be null. |
| `@NotBlank` | String must not be null, empty, or contain only whitespace. |
| `@Email` | String must have a valid email format. |
| `@Size` | Checks the minimum and maximum size of a value. |

# 3. @NotNull

The `@NotNull` annotation ensures that a field must not contain a null value.
Note: `@NotNull` does not reject an empty string.

# 4. @NotBlank

The `@NotBlank` annotation ensures that a String:
- Is not null.
- Is not empty.
- Does not contain only whitespace.

# 5. @Email

The `@Email` annotation checks whether an email address has a valid email format.
Note: `@Email` checks the format, not whether the email address actually exists.

# 6. @Size

The `@Size` annotation checks the size or length of a field.
It supports minimum and maximum values.

# 7. Using Multiple Validation Annotations

We can apply multiple validation annotations to a single class.

# Using @Valid
To activate validation when receiving request data, use `@Valid` in the controller.
```java
@PostMapping("/employees")
public String addEmployee(@Valid @RequestBody Employee employee) {

    return "Employee added successfully";
}
```

If the submitted data violates any validation rule, Spring generates a validation exception.

# 8. Global Exception Handling

Exception Handling is used to manage errors that occur during application execution.

For example:
- Employee ID does not exist.
- User submits invalid data.
- Required information is missing.
- An unexpected server error occurs.

Instead of allowing the application to return an unclear error, we can provide a meaningful response.


# 9. @ControllerAdvice

`@ControllerAdvice` is a Spring annotation used to handle exceptions globally across multiple controllers.
Instead of writing exception-handling code in every controller, we can create one common exception-handling class.

# @ControllerAdvice vs @RestControllerAdvice

| Annotation | Purpose |
|---|---|
| `@ControllerAdvice` | Provides global exception handling and other controller advice features. |
| `@RestControllerAdvice` | Combines `@ControllerAdvice` and `@ResponseBody`, making it convenient for REST APIs returning JSON or other response bodies. |

# 10. Custom Exception Handling

We can also create our own exceptions for specific situations.

# 11. Difference Between Validation and Exception Handling

| Validation | Exception Handling |
|---|---|
| Checks incoming data. | Handles errors occurring in the application. |
| Prevents invalid data from being processed. | Provides meaningful error responses. |
| Uses annotations such as `@NotBlank`, `@Email`, `@Size`. | Uses `@ExceptionHandler` and `@ControllerAdvice`. |
| Example: Checking whether an email is valid. | Example: Handling an employee-not-found error. |

# Tasks Done:
Create standardized API errors:
{
"status": 400,
"message": "Invalid employee data",
"timestamp": "..."
}
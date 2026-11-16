# Day 32 — Dependency Injection

# Topics covered :-
• Constructor injection
• Setter injection
• Field injection
• @Component
• @Service
• @Repository
• @Autowired

# 1. Constructor Injection

Constructor Injection is a technique in which dependencies are provided through a class constructor.
Example:
@Component
public class Car {
    private final Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
}

Advantages:
* Promotes loose coupling.
* Makes dependencies mandatory.
* Supports final fields.
* Easy to test.

Constructor Injection is generally the recommended approach.

# 2. Setter Injection

Setter Injection provides dependencies through setter methods.
Example:
@Component
public class Car {
    private Engine engine;
    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

Advantages:
* Useful for optional dependencies.
* Allows dependencies to be changed after object creation.

# 3. Field Injection

Field Injection injects dependencies directly into class fields using `@Autowired`.
Example:
@Component
public class Car {
    @Autowired
    private Engine engine;
}

Disadvantages:
* Dependencies are less visible.
* Makes unit testing harder.
* Cannot use final fields for injected dependencies.

Constructor Injection is generally preferred over Field Injection.

# 4. @Component

`@Component` marks a class as a Spring-managed component.
Spring detects this class through component scanning and creates its Bean.

# 5. @Service

`@Service` marks a class as a service-layer component.
It is generally used to contain business logic.

# 6. @Repository

`@Repository` marks a class as a data-access component.
It is generally responsible for interacting with databases or other data sources.

# 7. @Autowired

`@Autowired` tells Spring to inject the required dependency automatically.
With a single constructor, Spring automatically performs constructor injection without requiring `@Autowired`.

# Difference Between Dependency Injection Types

| Constructor Injection     | Setter Injection                         | Field Injection                        |
| ------------------------- | ---------------------------------------- | -------------------------------------- |
| Uses constructor          | Uses setter method                       | Uses class field                       |
| Recommended               | Useful for optional dependencies         | Generally discouraged                  |
| Supports final fields     | Does not support final injected fields   | Does not support final injected fields |
| Dependencies are explicit | Dependencies are visible through setters | Dependencies are hidden                |


# Difference Between Spring Annotations

| Annotation  | Purpose                        |
| ----------- | ------------------------------ |
| @Component  | General Spring component       |
| @Service    | Business logic layer           |
| @Repository | Data access layer              |
| @Controller | Presentation layer             |
| @Autowired  | Automatic dependency injection |

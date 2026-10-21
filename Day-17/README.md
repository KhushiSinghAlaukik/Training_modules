# Day-17

# Functional Programming - 
Functional Programming is a programming approach in which functions are treated as values and can be passed as arguments to other methods.
Java introduced major functional programming features in **Java 8**, including:
* Functional Interfaces
* Lambda Expressions
* Method References
* Stream API
* Built-in functional interfaces such as `Predicate`, `Consumer`, `Supplier`, and `Function`
These features help developers write cleaner, shorter, reusable, and more expressive code.

# 1. Functional Interfaces

A Functional Interface is an interface that contains exactly one abstract method.
It can contain:
* One abstract method
* Multiple default methods
* Multiple static methods
* Methods inherited from `Object`.
A functional interface can be implemented using a lambda expression or a method reference.

-Syntax
@FunctionalInterface
interface InterfaceName {
    void methodName();
}

-Why Use `@FunctionalInterface`? - 
The `@FunctionalInterface` annotation tells the compiler that the interface is intended to have exactly one abstract method.
If we declare another unrelated abstract method, the compiler reports an error.

# 2. Lambda Expressions-
A Lambda Expression is a concise way to provide an implementation of a functional interface without creating a separate implementing class.
Lambda expressions were introduced in Java 8.

-Syntax
(parameters) -> expression
Or:
(parameters) -> {
    // Multiple statements
};
The `->` symbol is called the lambda operator.
It separates the parameters from the implementation.
When using a block body with `{}`, an explicit `return` is needed if the method must return a value.

# 3. Predicate Functional Interface -

`Predicate<T>` is a built-in functional interface from the `java.util.function` package.
It accepts one argument and returns a boolean value.
It is commonly used for testing conditions and filtering data.
- Syntax
Predicate<Type> predicate = value -> condition;

- Important Predicate Methods
| Method      | Purpose                                                      |
| ----------- | ------------------------------------------------------------ |
| `test()`    | Tests a condition                                            |
| `and()`     | Combines two predicates using logical AND                    |
| `or()`      | Combines two predicates using logical OR                     |
| `negate()`  | Reverses the result                                          |
| `isEqual()` | Creates a predicate that checks equality with a target value |

- Use cases:
* Validating user input
* Filtering collections
* Checking eligibility
* Testing conditions

`Consumer<T>` is a functional interface that accepts one argument and performs an operation without returning a result.
It is commonly used for printing, logging, and processing values.

## Important Consumer Methods

| Method      | Purpose                                      |
| ----------- | -------------------------------------------- |
| `accept()`  | Performs the operation                       |
| `andThen()` | Chains another consumer to execute afterward |

  Use cases:
* Printing values
* Logging messages
* Sending notifications
* Processing collection elements

# 5. Supplier Functional Interface-

`Supplier<T>` is a functional interface that produces or supplies a value without accepting any arguments.
It is commonly used to generate values or defer the creation of an object until needed.

### Syntax
Supplier<Type> supplier = () -> value;

  Use cases:
* Generating values
* Creating objects when needed
* Supplying default values
* Obtaining the current date or time.

# 6. Function Functional Interface -

`Function<T, R>` is a functional interface that accepts one argument of type `T` and returns a result of type `R`.
It is commonly used to transform or convert values.

# Syntax-
Function<InputType, ReturnType> function = value -> result;
The `apply()` method executes the function and returns the result.

## Important Function Methods

| Method       | Purpose                                             |
| ------------ | --------------------------------------------------- |
| `apply()`    | Applies the function                                |
| `andThen()`  | Executes this function first, then another function |
| `compose()`  | Executes another function first, then this function |
| `identity()` | Returns a function that returns its input unchanged |

With `compose()`, the order is reversed:

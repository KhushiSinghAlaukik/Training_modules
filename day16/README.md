# Day16


# Topics Covered

* Generic Classes
* Generic Methods
* Type Safety
* Wildcards
* Bounded Types


# 1. Generic Classes

A generic class is a class that accepts a type parameter. It allows the same class to work with different data types.

- Syntax
class ClassName<T> {
    T data;
}
Here, T represents a type parameter whose actual type is specified when creating an object.

-Key Points
* A generic class uses type parameters such as `T`, `E`, `K`, and `V`.
* The same class can work with different reference types.
* Generics improve code reusability and type safety.
* Primitive types such as `int` cannot be used directly as generic type arguments. Use wrapper classes such as `Integer`.

# 2. Generic Methods

A generic method declares its own type parameter and can work with different data types.
A generic method can exist inside either a generic or a non-generic class.

-Syntax
public <T> void methodName(T value) {
    // Method body
}
The type parameter `<T>` is declared before the return type.

-Key Points
* A generic method declares its own type parameter.
* The compiler can often infer the type from the arguments.
* Generic methods reduce code duplication.
* The type parameter is available within the method's scope.


# 3. Type Safety

Type safety means ensuring that values are used according to their intended data types.

Generics provide compile-time type checking, helping prevent incompatible values from being stored or retrieved incorrectly.

-Advantages of Type Safety
* Detects many type-related errors at compile time.
* Reduces explicit type casting.
* Makes code easier to maintain.
* Prevents incompatible values from being added to typed collections.

# 4. Wildcards

A wildcard is represented by the question mark `?`.
It represents an unknown type and allows methods to work with generic types without requiring an exact type argument.

There are three main types of wildcards:
1. Unbounded wildcard
2. Upper-bounded wildcard
3. Lower-bounded wildcard

- Unbounded Wildcard (`<?>`)
An unbounded wildcard represents an unknown type.
Use case: When a method needs to process collections of different types without depending on their exact element types.

- Upper-Bounded Wildcard (`<? extends Type>`)
An upper-bounded wildcard accepts the specified type or one of its subtypes.
It can accept `List<Integer>`, `List<Double>`, or `List<Number>`.
Use case: When a method needs to read values from collections of a specified type or its subtypes.
You generally cannot add arbitrary non-null values to a collection declared with `? extends Number`, because its exact element type is unknown.

- Lower-Bounded Wildcard (`<? super Type>`)
A lower-bounded wildcard accepts the specified type or one of its supertypes.
It can accept `List<Integer>`, `List<Number>`, or `List<Object>`.
Use case: When a method needs to add values of a specified type to a   collection.                    |

# PECS Rule

PECS stands for:
* **P — Producer Extends:** Use `extends` when a collection primarily supplies values for reading.
* **C — Consumer Super:** Use `super` when a collection primarily receives values for writing.
This is a useful guideline when designing methods that work with generic collections.

# 5. Bounded Types

Bounded types restrict the types that can be used as generic type arguments.
They are useful when generic code needs access to methods defined by a particular superclass or interface.

- Upper-Bounded Type Parameter
- Multiple Bounds

# Day-17

# Topics covered

* Stream
* filter()
* map()
* sorted()
* collect()
* reduce()
* forEach()
* distinct()
* limit()

# 1. Stream

A **Stream** is a sequence of elements that supports operations to process data from a source, such as a collection or an array.
Streams do not store data. They process data from a source and can perform operations such as filtering, mapping, sorting, and reducing.
Without Stream API, we often use loops to process collections.
The Stream API makes the data-processing logic concise and readable.

- Creating a Stream
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Aman", "Khushi", "Rahul");

        names.stream()
             .forEach(System.out::println);
    }
}

- Important Characteristics of Streams
1. No storage: A stream does not store elements; it processes data from a source.
2. Functional operations: Supports operations such as `filter()`, `map()`, and `reduce()`.
3. Lazy evaluation: Intermediate operations generally execute only when a terminal operation is invoked.
4. Single-use: A stream cannot be reused after a terminal operation consumes it.
5. Pipeline processing: Multiple operations can be chained together.
6. Sequential or parallel: Streams can process data sequentially or, where appropriate, in parallel.

- Stream Operations

Stream operations are divided into two categories.

| Intermediate Operations | Terminal Operations |
| ----------------------- | ------------------- |
| `filter()`              | `collect()`         |
| `map()`                 | `reduce()`          |
| `sorted()`              | `forEach()`         |
| `distinct()`            | `count()`           |
| `limit()`               | `min()`             |
|                         | `max()`             |

Intermediate operations - return another stream.
Terminal operations - produce a result or a side effect and complete the stream pipeline.

# 2. filter()

The `filter()` method selects elements that satisfy a specified condition.
It takes a `Predicate`, which is a functional interface that returns `true` or `false`.

- Syntax
stream.filter(condition);

- Real-World Applications

* Finding employees earning above a specified salary.
* Selecting students who passed an examination.
* Filtering products by price.
* Finding active users.
* Selecting orders with a particular status.

# 3. map()

The `map()` method transforms each element of a stream into another value.
It applies a function to every element and returns a new stream containing the transformed elements.

- Syntax
stream.map(transformation);

- Real-World Applications
* Converting names to uppercase.
* Extracting employee names from employee objects.
* Calculating prices after applying a discount.
* Converting database entities into DTOs.
* Transforming product data for API responses.

# 4. sorted()

The `sorted()` method arranges stream elements in sorted order.
By default, it uses the natural ordering of elements. An overloaded version accepts a `Comparator` for custom ordering.

- Syntax
stream.sorted();

For custom sorting:
stream.sorted(comparator);

- Real-World Applications

* Sorting employees by salary.
* Sorting students by marks.
* Sorting products by price.
* Displaying names alphabetically.
* Ranking records according to a business rule.

# 5. collect()

The `collect()` method gathers the elements of a stream into a result, such as a list, set, or map.
It is a terminal operation.
In Java 8, it is commonly used with the `Collectors` utility class.

- Syntax
stream.collect(Collectors.toList());

- Important Collectors Methods

| Method                        | Purpose                                                |
| ----------------------------- | ------------------------------------------------------ |
| `Collectors.toList()`         | Collects elements into a list.                         |
| `Collectors.toSet()`          | Collects elements into a set.                          |
| `Collectors.toMap()`          | Collects elements into a map.                          |
| `Collectors.joining()`        | Joins strings into a single string.                    |
| `Collectors.counting()`       | Counts the elements.                                   |
| `Collectors.groupingBy()`     | Groups elements by a classification function.          |
| `Collectors.partitioningBy()` | Divides elements into two groups based on a predicate. |

- Real-World Applications

* Collecting filtered employees into a list.
* Removing duplicate values by collecting into a set.
* Grouping employees by department.
* Creating maps from database results.
* Combining names or labels into a single string.

# 6. reduce()

The `reduce()` method combines stream elements into a single result.
It is useful for operations such as calculating a sum, product, maximum, or combined string.

- Syntax
stream.reduce(identity, accumulator);

* Identity: The starting value.
* Accumulator: A function that combines the current result with the next element.

- Real-World Applications

* Calculating total sales.
* Calculating the sum of employee salaries.
* Calculating the product of numerical values.
* Combining text.
* Finding an aggregate result from a collection.

# 7. forEach()

The `forEach()` method performs an action for each element in a stream.
It is a terminal operation and is commonly used to print elements or perform other side effects.

- Syntax
stream.forEach(action);

- Real-World Applications
* Printing records.
* Logging processed items.
* Displaying employee details.
* Sending notifications for each item.
* Performing actions for each element.

* Best Practice:Prefer `map()` for transformations and `collect()` for building results. Avoid using `forEach()` to modify shared state unnecessarily.

# 8. distinct()

The `distinct()` method removes duplicate elements from a stream.
It determines duplicates using the elements' `equals()` method.
For an ordered stream, the first occurrence of each distinct element is retained.

- Syntax
stream.distinct();

- Real-World Applications
* Removing duplicate names.
* Finding unique product categories.
* Removing duplicate IDs.
* Processing unique transaction values.
* Extracting distinct values from records.

* Important: For custom objects, `distinct()` relies on correctly implemented `equals()` and `hashCode()` methods to identify logically equivalent objects.

# 9. limit()

The `limit()` method restricts a stream to at most a specified number of elements.
It is especially useful when you need only the first few elements of a stream.

- Syntax
stream.limit(number);

The argument must be non-negative.

- Real-World Applications
* Displaying the top five employees by salary.
* Showing the first ten products.
* Limiting search results.
* Displaying the latest few records after sorting.
* Implementing simple top-N operations.

# 10. Intermediate vs Terminal Operations

| Method       | Category     | Purpose                             | Return                            |
| ------------ | ------------ | ----------------------------------- | --------------------------------- |
| `filter()`   | Intermediate | Selects matching elements           | Stream                            |
| `map()`      | Intermediate | Transforms elements                 | Stream                            |
| `sorted()`   | Intermediate | Sorts elements                      | Stream                            |
| `distinct()` | Intermediate | Removes duplicates                  | Stream                            |
| `limit()`    | Intermediate | Restricts the number of elements    | Stream                            |
| `collect()`  | Terminal     | Collects elements into a result     | Collection or another result type |
| `reduce()`   | Terminal     | Combines elements into a result     | Result or Optional                |
| `forEach()`  | Terminal     | Performs an action for each element | `void`                            |

### Important Concept: Lazy Evaluation

Intermediate operations such as `filter()` and `map()` are generally lazy.
They do not process the entire stream immediately. Processing starts when a terminal operation is invoked.

# Task-1
Build:
Employee Analytics System
Examples:
Employees with salary > 50,000
Employees by department
Highest salary
Average salary
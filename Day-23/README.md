# Day 23 — Advanced SQL

## 📚 Overview

This day focuses on advanced SQL concepts used to retrieve related data, perform calculations, write nested queries, and improve database query performance.

These concepts are important for developers working with Java, Spring Boot, MySQL, and other relational databases.

## 🎯 Topics Covered

* Joins
* INNER JOIN
* LEFT JOIN
* RIGHT JOIN
* Subqueries
* Aggregate Functions
* Indexes

---

# 1. Joins

## What is a JOIN?

A **JOIN combines related data from two or more tables using a specified relationship or condition**.

In real-world applications, information is usually stored in multiple related tables rather than one large table.

For example, an e-commerce application may have separate tables for customers and orders.

### Customers Table

| customer_id | name  |
| ----------- | ----- |
| 1           | Aman  |
| 2           | Priya |
| 3           | Rahul |
| 4           | Neha  |

### Orders Table

| order_id | customer_id | product    |
| -------- | ----------- | ---------- |
| 101      | 1           | Laptop     |
| 102      | 2           | Mobile     |
| 103      | 1           | Headphones |

Notice that `customer_id` connects the two tables.

A JOIN allows us to retrieve customer names along with their orders.

### Create the Tables

```sql
CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product VARCHAR(50),

    FOREIGN KEY (customer_id)
        REFERENCES Customers(customer_id)
);
```

### Insert Sample Data

```sql
INSERT INTO Customers VALUES
(1, 'Aman'),
(2, 'Priya'),
(3, 'Rahul'),
(4, 'Neha');

INSERT INTO Orders VALUES
(101, 1, 'Laptop'),
(102, 2, 'Mobile'),
(103, 1, 'Headphones');
```

We will use these tables to understand different types of JOINs.

---

# 2. INNER JOIN

## What is INNER JOIN?

An **INNER JOIN returns only the rows that have matching values in both tables according to the join condition**.

### Example

```sql
SELECT
    Customers.customer_id,
    Customers.name,
    Orders.order_id,
    Orders.product
FROM Customers
INNER JOIN Orders
    ON Customers.customer_id = Orders.customer_id;
```

### Output

| customer_id | name  | order_id | product    |
| ----------- | ----- | -------- | ---------- |
| 1           | Aman  | 101      | Laptop     |
| 2           | Priya | 102      | Mobile     |
| 1           | Aman  | 103      | Headphones |

Rahul and Neha do not appear because they have not placed any orders.

### How Does It Work?

1. SQL reads the Customers and Orders tables.
2. It compares `customer_id` values using the `ON` condition.
3. It returns rows where the condition matches.

### Real-World Applications

* Display customers who have placed orders.
* Find employees assigned to projects.
* Retrieve products belonging to existing categories.
* Display students enrolled in courses.

**Remember:** INNER JOIN returns matching records only.

---

# 3. LEFT JOIN

## What is LEFT JOIN?

A **LEFT JOIN returns all rows from the left table and matching rows from the right table**.

If a row in the left table has no matching row in the right table, the right-table columns contain `NULL`.

### Example

```sql
SELECT
    Customers.customer_id,
    Customers.name,
    Orders.order_id,
    Orders.product
FROM Customers
LEFT JOIN Orders
    ON Customers.customer_id = Orders.customer_id;
```

### Output

| customer_id | name  | order_id | product    |
| ----------- | ----- | -------- | ---------- |
| 1           | Aman  | 101      | Laptop     |
| 1           | Aman  | 103      | Headphones |
| 2           | Priya | 102      | Mobile     |
| 3           | Rahul | NULL     | NULL       |
| 4           | Neha  | NULL     | NULL       |

Notice that Rahul and Neha appear even though they have not placed any orders.

Their order information is `NULL` because no matching order exists.

### Why Is LEFT JOIN Useful?

Suppose you are building an e-commerce application.

You want to display **all registered customers, including customers who have never purchased anything**.

INNER JOIN would exclude customers without orders.

LEFT JOIN includes them.

### Find Customers Without Orders

```sql
SELECT
    Customers.customer_id,
    Customers.name
FROM Customers
LEFT JOIN Orders
    ON Customers.customer_id = Orders.customer_id
WHERE Orders.order_id IS NULL;
```

### Output

| customer_id | name  |
| ----------- | ----- |
| 3           | Rahul |
| 4           | Neha  |

### Real-World Applications

* Display all customers, including inactive customers.
* Find employees who are not assigned to projects.
* Find products that have never been sold.
* Identify students who have not enrolled in any course.

**Remember:** LEFT JOIN returns all rows from the left table, whether or not a match exists in the right table.

---

# 4. RIGHT JOIN

## What is RIGHT JOIN?

A **RIGHT JOIN returns all rows from the right table and matching rows from the left table**.

When no matching row exists in the left table, the left-table columns contain `NULL`.

### Example

Consider these tables.

**Employees**

| employee_id | name  |
| ----------- | ----- |
| 1           | Aman  |
| 2           | Priya |
| 3           | Rahul |

**Projects**

| project_id | employee_id | project_name     |
| ---------- | ----------- | ---------------- |
| 101        | 1           | Inventory System |
| 102        | 2           | Banking App      |
| 103        | NULL        | AI Chatbot       |

Now suppose we want to display all projects, including projects that do not have an assigned employee.

```sql
SELECT
    Employees.name,
    Projects.project_name
FROM Employees
RIGHT JOIN Projects
    ON Employees.employee_id = Projects.employee_id;
```

### Output

| name  | project_name     |
| ----- | ---------------- |
| Aman  | Inventory System |
| Priya | Banking App      |
| NULL  | AI Chatbot       |

The AI Chatbot project appears even though it has no assigned employee.

### Real-World Applications

* Display all projects, including unassigned projects.
* Display all departments, including departments without employees.
* Retrieve all records from a designated right-side table, even when matching information is unavailable.

**Remember:** RIGHT JOIN preserves all rows from the right table.

### LEFT JOIN vs RIGHT JOIN

| LEFT JOIN                                    | RIGHT JOIN                                    |
| -------------------------------------------- | --------------------------------------------- |
| Preserves all rows from the left table       | Preserves all rows from the right table       |
| Unmatched right-side columns become `NULL`   | Unmatched left-side columns become `NULL`     |
| Useful when the left table is the main table | Useful when the right table is the main table |

**Interview tip:** A RIGHT JOIN can often be rewritten as a LEFT JOIN by swapping the order of the tables.

---

# 5. Subqueries

## What is a Subquery?

A **subquery is a SQL query written inside another SQL query**.

The inner query produces a result that the outer query can use.

Subqueries are useful when the result of one query is needed to answer another question.

### Example: Find Employees Earning More Than the Average Salary

Suppose we have an Employees table.

| employee_id | name  | salary |
| ----------- | ----- | -----: |
| 1           | Aman  |  30000 |
| 2           | Priya |  40000 |
| 3           | Rahul |  50000 |
| 4           | Neha  |  60000 |

We want to find employees earning more than the company's average salary.

### SQL Query

```sql
SELECT name, salary
FROM Employees
WHERE salary > (
    SELECT AVG(salary)
    FROM Employees
);
```

### How Does It Work?

**Step 1: Execute the inner query conceptually.**

```sql
SELECT AVG(salary)
FROM Employees;
```

The average salary is:

`(30000 + 40000 + 50000 + 60000) / 4 = 45000`

**Step 2: Use the result in the outer query.**

```sql
SELECT name, salary
FROM Employees
WHERE salary > 45000;
```

### Output

| name  | salary |
| ----- | -----: |
| Rahul |  50000 |
| Neha  |  60000 |

The database optimizer may execute or transform parts of a query differently, but this is a useful way to understand its logic.

### Another Example: Find the Highest-Paid Employee

```sql
SELECT name, salary
FROM Employees
WHERE salary = (
    SELECT MAX(salary)
    FROM Employees
);
```

This returns all employees whose salaries equal the maximum salary.

### Types of Subqueries

**1. Single-row subquery**

Returns one row.

Example:

```sql
SELECT name
FROM Employees
WHERE salary = (
    SELECT MAX(salary)
    FROM Employees
);
```

**2. Multiple-row subquery**

Returns multiple rows.

Example:

```sql
SELECT name
FROM Employees
WHERE department_id IN (
    SELECT department_id
    FROM Departments
    WHERE location = 'Indore'
);
```

This finds employees belonging to departments located in Indore.

**3. Correlated subquery**

References a column from the outer query.

Example:

```sql
SELECT e.name, e.salary, e.department_id
FROM Employees e
WHERE e.salary > (
    SELECT AVG(e2.salary)
    FROM Employees e2
    WHERE e2.department_id = e.department_id
);
```

This finds employees earning more than the average salary of their own department.

### Real-World Applications

* Find employees earning above average.
* Find customers who have placed orders.
* Find products priced above the average product price.
* Find employees earning more than their department's average salary.

**Remember:** A subquery is a query inside another query.

---

# 6. Aggregate Functions

## What Are Aggregate Functions?

Aggregate functions perform calculations on multiple rows and return a single result for the selected set of data.

They are commonly used in reporting, dashboards, and business analytics.

### Common Aggregate Functions

| Function  | Purpose                        |
| --------- | ------------------------------ |
| `COUNT()` | Counts rows or non-NULL values |
| `SUM()`   | Calculates a total             |
| `AVG()`   | Calculates an average          |
| `MAX()`   | Returns the maximum value      |
| `MIN()`   | Returns the minimum value      |

Let's use this Employees table.

| employee_id | name  | department | salary |
| ----------- | ----- | ---------- | -----: |
| 1           | Aman  | IT         |  40000 |
| 2           | Priya | HR         |  35000 |
| 3           | Rahul | IT         |  50000 |
| 4           | Neha  | HR         |  45000 |

### A. COUNT()

Counts employees.

```sql
SELECT COUNT(*) AS total_employees
FROM Employees;
```

Output:

| total_employees |
| --------------: |
|               4 |

`COUNT(*)` counts all rows.

### B. SUM()

Calculates the total salary.

```sql
SELECT SUM(salary) AS total_salary
FROM Employees;
```

Output:

| total_salary |
| -----------: |
|       170000 |

### C. AVG()

Calculates the average salary.

```sql
SELECT AVG(salary) AS average_salary
FROM Employees;
```

Output:

| average_salary |
| -------------: |
|          42500 |

### D. MAX()

Finds the highest salary.

```sql
SELECT MAX(salary) AS highest_salary
FROM Employees;
```

Output:

| highest_salary |
| -------------: |
|          50000 |

### E. MIN()

Finds the lowest salary.

```sql
SELECT MIN(salary) AS lowest_salary
FROM Employees;
```

Output:

| lowest_salary |
| ------------: |
|         35000 |

### Aggregate Functions with GROUP BY

Suppose we want to calculate the average salary of each department.

```sql
SELECT
    department,
    AVG(salary) AS average_salary
FROM Employees
GROUP BY department;
```

Output:

| department | average_salary |
| ---------- | -------------: |
| IT         |          45000 |
| HR         |          40000 |

### Real-World Applications

* Calculate total sales.
* Count registered customers.
* Calculate average employee salaries.
* Find the most expensive product.
* Find the minimum stock quantity.
* Generate dashboard statistics.

**Remember:** Aggregate functions summarize data instead of returning every individual value.

---

# 7. Indexes

## What Is an Index?

An **index is a database structure that helps the database find rows more efficiently without scanning every row in many situations**.

Think of a book.

If you want to find a topic, you can use the index at the end of the book rather than reading every page.

A database index serves a similar purpose.

### Example Without an Index

Suppose your Customers table contains 100,000 records.

You execute:

```sql
SELECT *
FROM Customers
WHERE email = 'aman@example.com';
```

Without a suitable index, the database may need to examine many rows to find the matching email.

This is called a table scan.

### Create an Index

```sql
CREATE INDEX idx_customer_email
ON Customers(email);
```

Now the database has an index it can use to locate matching email values more efficiently.

Run the query again:

```sql
SELECT *
FROM Customers
WHERE email = 'aman@example.com';
```

The optimizer can choose to use the index when it estimates that doing so is beneficial.

**Important:** Creating an index does not guarantee that every query will become faster. The database optimizer decides whether an index is appropriate.

### Types of Indexes

#### 1. Primary Key Index

A primary key is backed by an index in MySQL's InnoDB storage engine.

Example:

```sql
CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50)
);
```

MySQL automatically creates the required primary key index.

#### 2. Unique Index

A unique index prevents duplicate indexed key values.

```sql
CREATE UNIQUE INDEX idx_employee_email
ON Employees(email);
```

This is useful when email addresses must be unique.

A unique index and a `UNIQUE` constraint are closely related in MySQL; creating the unique index directly is one way to enforce uniqueness.

#### 3. Regular Index

A regular index improves lookup performance for suitable queries.

```sql
CREATE INDEX idx_employee_department
ON Employees(department);
```

This can help queries that frequently filter or join using the department column.

#### 4. Composite Index

A composite index contains multiple columns.

```sql
CREATE INDEX idx_department_salary
ON Employees(department, salary);
```

This index may help queries such as:

```sql
SELECT *
FROM Employees
WHERE department = 'IT'
AND salary > 40000;
```

Column order matters. An index on `(department, salary)` is generally most useful for conditions beginning with `department`, rather than conditions filtering only on `salary`.

### Disadvantages of Indexes

Indexes are useful, but they have trade-offs.

* They consume additional storage.
* Inserts may take longer because indexes need updating.
* Updates and deletes may require index maintenance.
* Too many indexes can reduce write performance.
* An unsuitable index may provide little benefit.

### Real-World Applications

Indexes are particularly useful for frequently searched columns, such as:

* Customer email addresses.
* Product IDs.
* Employee IDs.
* Order dates.
* Foreign key columns used in joins.

**Remember:** Indexes can improve query performance, but they should be designed according to actual query patterns.

---

# 8. Complete Practice Example

Let's create a small database for an e-commerce application.

## Step 1: Create the Database

```sql
CREATE DATABASE ShopDB;
USE ShopDB;
```

## Step 2: Create Customers

```sql
CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(50),
    city VARCHAR(50)
);
```

## Step 3: Create Orders

```sql
CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product VARCHAR(50),
    amount DECIMAL(10, 2),

    FOREIGN KEY (customer_id)
        REFERENCES Customers(customer_id)
);
```

## Step 4: Insert Data

```sql
INSERT INTO Customers VALUES
(1, 'Aman', 'Indore'),
(2, 'Priya', 'Bhopal'),
(3, 'Rahul', 'Delhi'),
(4, 'Neha', 'Mumbai');

INSERT INTO Orders VALUES
(101, 1, 'Laptop', 55000),
(102, 2, 'Mobile', 20000),
(103, 1, 'Mouse', 500),
(104, 2, 'Keyboard', 1000);
```

## Step 5: Use INNER JOIN

Find customers who have placed orders.

```sql
SELECT
    Customers.name,
    Orders.product,
    Orders.amount
FROM Customers
INNER JOIN Orders
    ON Customers.customer_id = Orders.customer_id;
```

## Step 6: Use LEFT JOIN

Find all customers, including those who have not placed orders.

```sql
SELECT
    Customers.name,
    Orders.order_id
FROM Customers
LEFT JOIN Orders
    ON Customers.customer_id = Orders.customer_id;
```

## Step 7: Use a Subquery

Find orders whose amount is greater than the average order amount.

```sql
SELECT *
FROM Orders
WHERE amount > (
    SELECT AVG(amount)
    FROM Orders
);
```

## Step 8: Use Aggregate Functions

Calculate total order value.

```sql
SELECT SUM(amount) AS total_order_value
FROM Orders;
```

## Step 9: Use GROUP BY

Calculate total spending per customer.

```sql
SELECT
    Customers.customer_id,
    Customers.name,
    SUM(Orders.amount) AS total_spending
FROM Customers
INNER JOIN Orders
    ON Customers.customer_id = Orders.customer_id
GROUP BY Customers.customer_id, Customers.name;
```

## Step 10: Use HAVING

Find customers whose total spending exceeds ₹10,000.

```sql
SELECT
    Customers.customer_id,
    Customers.name,
    SUM(Orders.amount) AS total_spending
FROM Customers
INNER JOIN Orders
    ON Customers.customer_id = Orders.customer_id
GROUP BY Customers.customer_id, Customers.name
HAVING SUM(Orders.amount) > 10000;
```

## Step 11: Create an Index

```sql
CREATE INDEX idx_orders_customer
ON Orders(customer_id);
```

This index may help queries that frequently search or join orders by customer ID.

---

# 9. SQL Interview Questions

### Q1. What is a JOIN?

A JOIN combines related rows from multiple tables using a specified condition.

### Q2. What is the difference between INNER JOIN and LEFT JOIN?

INNER JOIN returns matching rows only, whereas LEFT JOIN returns every row from the left table and matching rows from the right table.

### Q3. What is the difference between LEFT JOIN and RIGHT JOIN?

LEFT JOIN preserves all left-table rows; RIGHT JOIN preserves all right-table rows.

### Q4. What is a subquery?

A subquery is a query nested inside another SQL query.

### Q5. What is a correlated subquery?

A correlated subquery references a column from the outer query and is logically evaluated in relation to each relevant outer row.

### Q6. What are aggregate functions?

Aggregate functions summarize data using calculations such as `COUNT`, `SUM`, `AVG`, `MIN`, and `MAX`.

### Q7. What is an index?

An index is a database structure that can improve the efficiency of retrieving rows.

### Q8. Do indexes always improve performance?

No. Indexes consume storage and can slow down data modifications. Their effectiveness depends on the query and data distribution.

### Q9. What is a composite index?

A composite index contains two or more columns.

### Q10. How would you find customers who have never placed an order?

```sql
SELECT c.*
FROM Customers c
LEFT JOIN Orders o
    ON c.customer_id = o.customer_id
WHERE o.order_id IS NULL;
```

### Q11. How would you find employees earning more than their department's average salary?

```sql
SELECT e.name, e.salary, e.department
FROM Employees e
WHERE e.salary > (
    SELECT AVG(e2.salary)
    FROM Employees e2
    WHERE e2.department = e.department
);
```

### Q12. How would you find the total sales for each customer?

```sql
SELECT
    customer_id,
    SUM(amount) AS total_sales
FROM Orders
GROUP BY customer_id;
```

---

# 10. Practice Tasks

Complete these tasks using the ShopDB database.

1. Display all customers and their orders using INNER JOIN.
2. Display all customers, including customers without orders, using LEFT JOIN.
3. Find customers who have never placed an order.
4. Display all orders whose amount is greater than the average order amount.
5. Calculate the total value of all orders.
6. Find the highest-value order.
7. Calculate the total spending of each customer.
8. Find customers whose total spending exceeds ₹10,000.
9. Create an index on `Orders.amount`.
10. Create a composite index on `Orders(customer_id, amount)`.
11. Compare the indexes using `EXPLAIN` with suitable queries.
12. Explain why creating indexes on every column is not recommended.

---

## ✅ Day 23 Summary

By the end of this day, you should understand:

* How JOINs combine related data.
* The difference between INNER JOIN, LEFT JOIN, and RIGHT JOIN.
* How subqueries work.
* How aggregate functions summarize data.
* How GROUP BY and HAVING support grouped calculations.
* How indexes can improve query performance.
* How to use these concepts in real-world applications.

### Next Step

Practice these SQL queries in MySQL Workbench or another MySQL client.

For Java Full Stack Developer interviews, focus especially on **JOINs, subqueries, aggregate functions, GROUP BY, HAVING, and indexes**. These concepts are frequently useful when building Spring Boot applications and working with relational databases.

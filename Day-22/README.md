# Day 22 

# Topics Covered
* CREATE
* INSERT
* SELECT
* UPDATE
* DELETE
* WHERE
* ORDER BY
* GROUP BY
* HAVING

# 1. CREATE

The `CREATE` command is used to create database objects such as databases and tables.
Syntax - CREATE DATABASE CompanyDB;
Real-world application: Creating tables for employees, customers, products, orders, and suppliers.

# 2. INSERT

The `INSERT` command is used to add new records to a table.

Example-
INSERT INTO Employees (name, department, salary, city)
VALUES ('Aman', 'IT', 45000, 'Indore');

- Important Points
* Text values are enclosed in single quotes.
* Numeric values generally do not require quotes.
* Specify column names to make inserts easier to read and maintain.
* The database automatically generates `employee_id` because it uses `AUTO_INCREMENT`.

# 3. SELECT

The `SELECT` command retrieves data from a database table.
Synatx-
SELECT * FROM Employees;
The `*` means all columns.

# 4. UPDATE

The `UPDATE` command modifies existing records in a table.

Example-
UPDATE Employees
SET salary = 55000
WHERE employee_id = 3;

# 5. DELETE

The `DELETE` command removes records from a table.
Example-
DELETE FROM Employees
WHERE employee_id = 4;

Important: In real applications, deleting business records may require authorization, transaction handling, or soft deletion rather than permanent deletion.

# 6. WHERE

The `WHERE` clause filters records based on a specified condition.

Example-
SELECT *
FROM Employees
WHERE department = 'IT';

# 7. ORDER BY

The `ORDER BY` clause sorts query results in ascending or descending order.

Example-
SELECT *
FROM Employees
ORDER BY salary ASC;

ASC means ascending order. It is the default sort direction.

# 8. GROUP BY

The `GROUP BY` clause groups rows that have the same values in specified columns.
It is commonly used with aggregate functions such as:
* COUNT()
* SUM()
* AVG()
* MIN()
* MAX()

# 9. HAVING

The `HAVING` clause filters groups created by `GROUP BY`.
It is especially useful when filtering based on aggregate values.

Example-
SELECT department, COUNT(*) AS total_employees
FROM Employees
GROUP BY department
HAVING COUNT(*) > 2;

# WHERE vs HAVING

| WHERE                                        | HAVING                                  |
| -------------------------------------------- | --------------------------------------- |
| Filters individual rows                      | Filters groups                          |
| Applied before grouping                      | Applied after grouping                  |
| Commonly used with regular column conditions | Commonly used with aggregate conditions |
| Example: `WHERE salary > 40000`              | Example: `HAVING AVG(salary) > 40000`   |

- Can We Use WHERE and HAVING Together?
Yes.
Example:-
SELECT department, AVG(salary) AS average_salary
FROM Employees
WHERE city = 'Indore'
GROUP BY department
HAVING AVG(salary) > 40000;

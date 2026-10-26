# Day 21

# Topics Covered
* Database
* DBMS
* RDBMS
* Tables, Rows, and Columns
* Primary Key
* Foreign Key
* Constraints
* Normalization
* Database Anomalies


# 1. Database

A database is an organized collection of data stored electronically.

- Why Do We Need a Database?

* To store large amounts of data.
* To retrieve information easily.
* To update existing records.
* To delete unnecessary records.
* To maintain organized and consistent data.

# 2. DBMS (Database Management System)

A DBMS is software used to create, store, retrieve, update, and manage data in a database.

- Responsibilities of a DBMS
* Data management
* Access control
* Data security
* Backup and recovery
* Data consistency

Remember: A database stores data, while a DBMS manages it.

# 3. RDBMS (Relational Database Management System)

An RDBMS is a type of DBMS that organizes data using the relational model, typically through tables consisting of rows and columns.
Remember: An RDBMS supports relationships between tables using keys and other relational mechanisms.

# 4. Tables, Rows, and Columns

- Table:-
A table stores related data in rows and columns.
- Example: Employees Table

| employee_id | name  | department | salary |
| ----------- | ----- | ---------- | -----: |
| 1           | Aman  | IT         |  40000 |
| 2           | Priya | HR         |  35000 |
| 3           | Rahul | IT         |  45000 |

- Row:-
A row represents one complete record.
Example:
`1, Aman, IT, 40000`

- Column:-
A column represents a particular attribute.

Examples:
* `employee_id`
* `name`
* `department`
* `salary`

# 5. Primary Key

A primary key uniquely identifies every record in a table.

- Rules
* Values must be unique.
* Values cannot be `NULL`.
* A table can have only one primary key constraint.
* A primary key can consist of multiple columns.

- Composite Primary Key:-
A composite primary key consists of two or more columns.

CREATE TABLE Enrollments (
    student_id INT,
    course_id INT,
    PRIMARY KEY (student_id, course_id)
);

This design prevents the same student-course combination from being inserted more than once.

# 6. Foreign Key

A foreign key references a primary key or another eligible unique key in the same or another table.
It helps maintain referential integrity.

- Why Do We Need a Foreign Key?
Suppose customer IDs 1, 2, and 3 exist in Customers.
The Orders table cannot reference customer ID 10 unless that customer exists in the referenced table.
This prevents invalid relationships.

- Primary Key vs Foreign Key

| Primary Key                          | Foreign Key                                  |
| ------------------------------------ | -------------------------------------------- |
| Uniquely identifies a record         | References a key in a table                  |
| Cannot contain `NULL`                | Can contain `NULL` if permitted              |
| Must be unique                       | Can contain duplicate values                 |
| One primary key constraint per table | Multiple foreign key constraints are allowed |

## 7. Constraints

Constraints are rules applied to database columns or tables to maintain data integrity.

- Types of Constraints

| Constraint    | Purpose                              | Example                     |
| ------------- | ------------------------------------ | --------------------------- |
| `PRIMARY KEY` | Uniquely identifies each record      | Student ID                  |
| `FOREIGN KEY` | Maintains valid relationships        | Customer ID in Orders       |
| `NOT NULL`    | Prevents `NULL` values               | Student name                |
| `UNIQUE`      | Prevents duplicate non-`NULL` values | Email address               |
| `CHECK`       | Enforces a condition                 | Salary must be non-negative |
| `DEFAULT`     | Supplies a default value             | Default department          |

- Explanation:-
* `PRIMARY KEY`: Employee ID must be unique and non-`NULL`.
* `NOT NULL`: Name is required.
* `UNIQUE`: Duplicate non-`NULL` email addresses are not allowed.
* `CHECK`: Salary cannot be negative.
* `DEFAULT`: Department is set to IT when the column is omitted from an insert.

Real-world application: Constraints help prevent invalid data from entering the database.

# 8. Normalization

Normalization is the process of organizing data into related tables to reduce unnecessary duplication and prevent data anomalies.

- Why Do We Need Normalization?
* To reduce redundant data.
* To improve data consistency.
* To make updates easier.
* To avoid insertion, update, and deletion anomalies.

- First Normal Form (1NF)

A table is in 1NF when each field contains an individual value and there are no repeating groups.

Example of a problem:

| student_id | subjects  |
| ---------- | --------- |
| 101        | Java, SQL |

Improved structure:

| student_id | subject |
| ---------- | ------- |
| 101        | Java    |
| 101        | SQL     |

- Second Normal Form (2NF)

A table must:
1. Be in 1NF.
2. Have no partial dependencies of non-key attributes on a candidate key.
In simple terms, when a composite key is used, non-key attributes must depend on the entire key rather than just part of it.

- Third Normal Form (3NF)

A table must:
1. Be in 2NF.
2. Have no transitive dependencies that violate 3NF.
In simple terms, non-key attributes should not depend on other non-key attributes in a way that violates the requirements of 3NF.

Remember:

* 1NF: Individual values and no repeating groups.
* 2NF: No partial dependencies.
* 3NF: No transitive dependencies that violate 3NF.

# 9. Database Anomalies

Anomalies are problems that can occur when poorly structured tables contain redundant data.
There are three main types.

1. Insertion Anomaly
Occurs when new information cannot be inserted conveniently without providing unrelated information.

2. Update Anomaly
Occurs when the same information is stored in multiple rows and must be updated in several places.

3. Deletion Anomaly
Occurs when deleting one record unintentionally removes other important information.

# Task
Created:
employee_db
Tables:
employees
departments
roles

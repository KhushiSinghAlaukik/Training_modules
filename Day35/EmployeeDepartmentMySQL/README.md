# Day 35 — Spring Data JPA

# 1. ORM (Object Relational Mapping)

ORM stands for Object Relational Mapping.
It is a programming technique that connects Java objects with relational database tables.
Instead of writing SQL queries manually for every database operation, ORM allows developers to work with Java classes and objects.

Example:
A Java Employee class can be mapped to an Employee table in MySQL.

Advantages:
- Reduces manual SQL queries.
- Simplifies database operations.
- Improves code maintainability.
- Maps Java objects to database tables.

# 2. JPA (Java Persistence API)

JPA stands for Java Persistence API.
It is a Java specification that defines how Java applications interact with relational databases using ORM.
JPA provides annotations and interfaces for managing database operations.

Common JPA annotations:

| Annotation | Purpose |
|---|---|
| `@Entity` | Marks a class as a database entity |
| `@Id` | Defines the primary key |
| `@GeneratedValue` | Automatically generates primary key values |
| `@Table` | Specifies the database table name |
| `@Column` | Specifies column properties |
| `@OneToMany` | Defines one-to-many relationship |
| `@ManyToOne` | Defines many-to-one relationship |
| `@OneToOne` | Defines one-to-one relationship |
| `@ManyToMany` | Defines many-to-many relationship |

# 3. Hibernate

Hibernate is an ORM framework and a popular implementation of the JPA specification.
It handles the conversion between Java objects and database records.

Responsibilities:
- Maps Java classes to database tables.
- Generates SQL queries.
- Performs CRUD operations.
- Manages entity persistence.
- Synchronizes Java objects with database records.

Relationship:
- JPA defines the specification.
- Hibernate implements the specification.
- Spring Data JPA simplifies repository-based database operations.

# 4. Entity

An Entity is a Java class that represents a table in a relational database.
The `@Entity` annotation marks a Java class as a persistent entity.

# 5. Repository

A Repository is an interface responsible for communicating with the database.
Spring Data JPA provides repository interfaces that reduce the need to write repetitive database-access code.

# 6. JpaRepository

`JpaRepository` is an interface provided by Spring Data JPA.
It provides ready-made methods for performing database operations.

Common methods:

| Method | Purpose |
|---|---|
| `save()` | Insert or update a record |
| `findAll()` | Retrieve all records |
| `findById()` | Retrieve a record by ID |
| `deleteById()` | Delete a record by ID |
| `existsById()` | Check whether a record exists |
| `count()` | Count total records |

# 7. Entity Relationships

Entity relationships define how different database tables are connected.
There are four major types of relationships in JPA.

#### A. One-to-One

One record in a table is associated with one record in another table.
Example:
- One person has one passport.
Annotation:
@OneToOne

#### B. One-to-Many

One record in a table is associated with multiple records in another table.
Example:
- One department has many employees.
Annotation:
@OneToMany(mappedBy = "department")

#### C. Many-to-One

Multiple records in one table are associated with one record in another table.
Example:
- Many employees belong to one department.
Annotation:
@ManyToOne
@JoinColumn(name = "department_id")

#### D. Many-to-Many

Multiple records in one table are associated with multiple records in another table.
Example:
- Multiple students can enroll in multiple courses.
Annotation:
@ManyToMany

# Task Done:
Connected Spring Boot to MySQL.
Build:
Employee
Department
relationship.
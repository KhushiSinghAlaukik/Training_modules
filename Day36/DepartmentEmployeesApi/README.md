# Day 36 — JPA Relationships

# 1. One-to-One Relationship

A One-to-One relationship means one record in a table is associated with exactly one record in another table.

Example:
- One person has one passport.
- One passport belongs to one person.
JPA Annotation:
@OneToOne

# 2. One-to-Many Relationship

A One-to-Many relationship means one record in a table can be associated with multiple records in another table.
Example:
- One department has multiple employees.
- One customer can place multiple orders.
JPA Annotation:
@OneToMany(mappedBy = "department")

# 3. Many-to-One Relationship

A Many-to-One relationship means multiple records in one table can be associated with one record in another table.
Example:
- Multiple employees belong to one department.
- Multiple orders belong to one customer.
JPA Annotation:
@ManyToOne

# 4. Many-to-Many Relationship

A Many-to-Many relationship means multiple records in one table can be associated with multiple records in another table.
Example:
- Multiple students can enroll in multiple courses.
- Multiple employees can work on multiple projects.
JPA Annotation
@ManyToMany

The `@JoinTable` annotation defines the intermediate table used to connect both entities.

# 5. Lazy Loading

Lazy Loading means related data is loaded only when it is accessed.
Example:
When an employee is fetched, its department information may not be loaded immediately. It is fetched when the department property is accessed.
Annotation
@ManyToOne(fetch = FetchType.LAZY)

Advantages:
- Avoids unnecessary database queries.
- Improves performance when related data is not required.
- Reduces unnecessary data loading.

# 6. Eager Loading

Eager Loading means related data is loaded immediately along with the main entity.
Annotation:
@ManyToOne(fetch = FetchType.EAGER)

Advantages:
- Related data is available immediately.
- Useful when associated information is frequently required.
- Can simplify access to related data.

Important: JPA defaults vary by relationship:
- `@OneToOne`: EAGER
- `@ManyToOne`: EAGER
- `@OneToMany`: LAZY
- `@ManyToMany`: LAZY

# Difference Between Lazy and Eager Loading

| Lazy Loading | Eager Loading |
|---|---|
| Loads related data when accessed | Loads related data immediately |
| Uses `FetchType.LAZY` | Uses `FetchType.EAGER` |
| Avoids unnecessary loading | May load unnecessary data |
| Useful when related data is not always required | Useful when related data is frequently needed |

## Comparison of JPA Relationships

| Relationship | Meaning | Example |
|---|---|---|
| One-to-One | One record relates to one record | Person – Passport |
| One-to-Many | One record relates to multiple records | Department – Employees |
| Many-to-One | Multiple records relate to one record | Employees – Department |
| Many-to-Many | Multiple records relate to multiple records | Students – Courses |

# Tasks Done:
Implemented:
Department
↓
Employees
with database relationships.
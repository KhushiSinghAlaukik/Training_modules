# Day 24 

# Topics Covered
* JDBC Architecture
* JDBC Driver
* Connection
* Statement
* PreparedStatement
* ResultSet
* Transactions

# 1. JDBC Architecture

JDBC architecture describes how a Java application communicates with a database using the JDBC API and a database-specific driver.

Java Application
       |
       v
    JDBC API
       |
       v
   JDBC Driver
       |
       v
  MySQL Database

- How Does It Work:-
Suppose you want to retrieve all products from your Inventory Management System.

Step 1: The Java application creates a database connection.
Step 2: The application uses JDBC classes and interfaces to execute an SQL query.
Step 3: The JDBC driver translates the JDBC operations into the database-specific communication protocol.
Step 4: MySQL processes the query and returns the results.
Step 5: Java reads the results and displays the product information.

- Main Components

| Component        | Purpose                                                 |
| ---------------- | ------------------------------------------------------- |
| Java Application | Contains the application logic                          |
| JDBC API         | Provides classes and interfaces for database operations |
| JDBC Driver      | Enables communication with a particular database        |
| Database         | Stores and manages application data                     |


# 2. JDBC Driver

A JDBC driver is a software component that enables a Java application to communicate with a particular database.
Different databases may use different communication protocols, so a suitable driver is needed.

- Examples
| Database             | JDBC Driver            |
| -------------------- | ---------------------- |
| MySQL                | MySQL Connector/J      |
| PostgreSQL           | PostgreSQL JDBC Driver |
| Oracle Database      | Oracle JDBC Driver     |
| Microsoft SQL Server | Microsoft JDBC Driver  |

- How Does the Driver Work?

The JDBC driver handles the database-specific communication needed to send the query to MySQL and receive its response.

# 3. Connection

A `Connection` represents an active session between a Java application and a database.
It allows Java to execute SQL statements and manage transactions.

# 4. Statement

A `Statement` is a JDBC interface used to execute SQL statements against a database.
It is suitable for executing simple SQL queries that do not require input parameters.
- Important Statement Methods:-
| Method            | Purpose                                                                                 |
| ----------------- | --------------------------------------------------------------------------------------- |
| `executeQuery()`  | Executes a query that returns a `ResultSet`, typically a `SELECT`                       |
| `executeUpdate()` | Executes an INSERT, UPDATE, DELETE, or other SQL statement that returns an update count |
| `execute()`       | Executes SQL when the result type may vary                                              |

- Limitation of Statement
Suppose a user enters a product name into a search box.
If you construct SQL by concatenating user input directly into a query, the query may become vulnerable to SQL injection.

For SQL queries containing user-provided values, `PreparedStatement` is generally the better choice.

Remember: Use `Statement` for simple SQL execution, but prefer `PreparedStatement` for parameterized queries.

# 5. PreparedStatement

A `PreparedStatement` is a JDBC interface used to execute parameterized SQL statements.
It allows you to define SQL with placeholders and provide the values separately.
It is generally preferred over `Statement` when queries contain user input.

- Why Do We Need PreparedStatement?
Suppose a login page asks the user to enter an email address.
You want to find the matching user in the database.\
A risky approach is to concatenate the input directly into SQL:

- Advantages of PreparedStatement
* Helps prevent SQL injection when values are bound as parameters.
* Makes parameterized SQL easier to read and maintain.
* Supports reusable SQL statement objects.
* May improve performance for repeated execution, depending on the driver and database.

Important: Placeholders represent values, not arbitrary SQL syntax such as table names or column names.
Remember: PreparedStatement is the preferred choice for most SQL queries containing user-provided values.

# 6. ResultSet

A `ResultSet` is a JDBC interface that represents tabular data returned by a query.
For example, when Java executes a `SELECT` query, the database may return multiple rows. The `ResultSet` allows Java to read those rows.

- Common ResultSet Methods

| Method         | Purpose                       |
| -------------- | ----------------------------- |
| `next()`       | Moves to the next row         |
| `getInt()`     | Reads an integer column       |
| `getString()`  | Reads a text column           |
| `getDouble()`  | Reads a floating-point number |
| `getDate()`    | Reads an SQL DATE value       |
| `getBoolean()` | Reads a boolean value         |

You can access columns by their names or by their one-based column indexes.
Remember: ResultSet allows Java to read rows returned by a query.

# 7. Transactions

A transaction is a group of database operations treated as one logical unit of work.
Transactions help maintain data consistency when multiple related operations must succeed or fail together.

- ACID Properties
Transactions are commonly described using four ACID properties.

| Property    | Meaning                                                                     |
| ----------- | --------------------------------------------------------------------------- |
| Atomicity   | All operations succeed together, or the transaction is rolled back          |
| Consistency | The transaction preserves the database's defined integrity rules            |
| Isolation   | Concurrent transactions are controlled to avoid invalid interference        |
| Durability  | Committed changes persist according to the database's durability guarantees |

# 8. Statement vs PreparedStatement

This is one of the most important JDBC interview questions.

| Statement                                                   | PreparedStatement                                            |
| ----------------------------------------------------------- | ------------------------------------------------------------ |
| Executes SQL statements directly                            | Executes parameterized SQL statements                        |
| SQL values may be assembled into a string                   | Values are supplied using placeholders                       |
| More vulnerable to SQL injection when input is concatenated | Helps prevent SQL injection through proper parameter binding |
| Useful for simple, fixed SQL                                | Preferred for queries containing input values                |
| Repeated execution may require rebuilding SQL strings       | Supports repeated execution with different parameter values  |

# Day 29 – MVC Architecture

# Topics covered
Model
View
Controller

# 1. What is MVC Architecture?

MVC is an architectural pattern that divides an application into three main components:
1. Model
2. View
3. Controller

- MVC Architecture Diagram
          CLIENT (Browser)
                 |
                 v
             Controller
                 |
                 v
               Model
                 |
                 v
                View
                 |
                 v
          CLIENT (Browser)

- Advantages of MVC
* Separates application responsibilities.
* Makes code easier to maintain.
* Improves code reusability.
* Makes testing easier.
* Supports parallel development.
* Reduces dependency between components.

# 2. Model

The Model represents the application's data and business-related information.
It is responsible for maintaining data and providing the necessary methods to access or modify it.

- Responsibilities:-
* Stores application data.
* Represents database entities.
* Contains data-related logic.
* Communicates with the database through appropriate layers.

# 3. View

The View represents the user interface of the application.
It is responsible for displaying information to users.

- Responsibilities
* Displays data.
* Provides forms and buttons.
* Shows success and error messages.
* Displays information received from the Controller.

- Technologies Used
* HTML
* CSS
* JavaScript
* JSP
* Thymeleaf

# 4. Controller

The Controller handles incoming requests from the user.
It acts as a connection between the Model and View.

- Responsibilities
* Receives user requests.
* Reads form data.
* Calls the appropriate Service methods.
* Selects the View.
* Sends data to the View.

# 5. Understanding the Complete MVC Flow

Consider a Student Registration Application.

       CLIENT (Browser)
               |
               | HTTP Request
               v
          Controller
          (Servlet)
               |
               | Calls
               v
            Service
               |
               | Calls
               v
              DAO
               |
               | JDBC Query
               v
            Database
               |
               | Returns Data
               v
              DAO
               |
               v
            Service
               |
               v
          Controller
               |
               | Sends Data
               v
             View
              (JSP)
               |
               v
        CLIENT (Browser)

This is a layered architecture commonly used in Java web applications.
The MVC pattern separates the Controller, Model and View, while Service and DAO provide additional separation of responsibilities.

# 6. Service Layer

The Service Layer contains the application's business logic.
It acts as an intermediate layer between the Controller and DAO.

- Responsibilities:-
* Implements business rules.
* Validates application-level data.
* Calls DAO methods.
* Processes business operations.
* Coordinates multiple database operations when required.

- Why do we need Service?
Without a Service layer, the Controller may contain too much business logic.
The Service layer keeps the Controller simple and makes business logic reusable.

# 7. DAO Layer

DAO stands for Data Access Object.
It is a design pattern used to separate database operations from business logic.

- Responsibilities
* Connects with the database.
* Executes SQL queries.
* Inserts records.
* Updates records.
* Deletes records.
* Retrieves records.

- Common DAO Operations

| Operation | SQL Command | Purpose           |
| --------- | ----------- | ----------------- |
| Create    | INSERT      | Adds new records  |
| Read      | SELECT      | Retrieves records |
| Update    | UPDATE      | Modifies records  |
| Delete    | DELETE      | Removes records   |

# 8. Database

A Database is used to store application information permanently.
Examples of databases:
* MySQL
* PostgreSQL
* Oracle
* MongoDB

# 9. Difference Between Controller, Service and DAO

| Component  | Main Responsibility         | Example        |
| ---------- | --------------------------- | -------------- |
| Controller | Handles HTTP requests       | StudentServlet |
| Service    | Implements business logic   | StudentService |
| DAO        | Handles database operations | StudentDAO     |
| Database   | Stores information          | MySQL          |


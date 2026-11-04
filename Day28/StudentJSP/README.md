# Day 28 – JavaServer Pages (JSP)

# Topics covered
• JSP
• JSP lifecycle
• JSP vs Servlet
• JSTL
• Expression Language

# 1. What is JSP?

JSP stands for JavaServer Pages.
It is a server-side technology used to develop dynamic web applications.
Using JSP, we can display dynamic information such as:
* Username
* User profile
* Database records
* Login messages
* Product details

- Why do we use JSP?
* To create dynamic web pages.
* To display data received from Servlets.
* To reduce Java code inside HTML.
* To separate presentation logic from business logic.
* To build user interfaces for Java web applications.

- How JSP Works:-

       Client (Browser)
               |
               v
          HTTP Request
               |
               v
          JSP Page
               |
               v
       JSP Converted into
           Servlet
               |
               v
       Servlet Executes
               |
               v
        HTML Response
               |
               v
        Client (Browser)

Important: A JSP page is internally translated into a Servlet by the JSP container.

# 2. JSP Lifecycle

The JSP lifecycle describes the different stages through which a JSP page passes during execution.
The JSP container manages the entire lifecycle.

-  Steps of JSP Lifecycle

* 1.Translation
The JSP page is converted into a Java Servlet source file.

* 2.Compilation
The generated Servlet source code is compiled into a `.class` file.

* 3.Class Loading
The Servlet class is loaded into memory.

* 4.Instantiation
The JSP Servlet object is created.

* 5.Initialization – jspInit()
Called only once.
Used to initialize resources.

* 6.Request Processing – _jspService()
Called for every request.
Processes client requests.
Generates the response.

* 7.Destruction – jspDestroy()
Called before the JSP Servlet is removed. 
Used to release resources.

# JSP Lifecycle Methods

| Method          | Description               | Execution               |
| --------------- | ------------------------- | ----------------------- |
| `jspInit()`     | Initializes JSP resources | Once                    |
| `_jspService()` | Processes requests        | For every request       |
| `jspDestroy()`  | Releases resources        | Once before destruction |


# 3. JSP vs Servlet
Both JSP and Servlet are Java technologies used to develop dynamic web applications.
However, they serve different purposes.

- JSP
* Mainly used for presentation logic.
* HTML is written directly.
* Java code can be included, although scriptlets are generally discouraged.
* Suitable for displaying dynamic content.

- Servlet
* Mainly used for request processing and control logic.
* Java code is written directly.
* HTML output is generated using Java code.
* Suitable for handling form submissions and business requests.

# Difference Between JSP and Servlet

| Feature       | JSP                         | Servlet                      |
| ------------- | --------------------------- | ---------------------------- |
| Full Form     | JavaServer Pages            | Java Servlet                 |
| Type          | Server-side page technology | Server-side Java class       |
| Main Purpose  | Presentation logic          | Request processing           |
| Coding        | HTML with JSP elements      | Java code                    |
| Compilation   | Converted into Servlet      | Compiled as Java class       |
| Lifecycle     | Managed by JSP container    | Managed by Servlet container |
| HTML Handling | Easy to write HTML          | HTML is generated using Java |
| Usage         | Display dynamic pages       | Process requests             |
| Example       | Dashboard.jsp               | LoginServlet.java            |

# How JSP and Servlet Work Together

Consider a login application.

       User Login Form
               |
               v
         LoginServlet
               |
               v
       Validate Credentials
               |
               v
          Database
               |
               v
        Forward Request
               |
               v
          dashboard.jsp
               |
               v
        Display Welcome Page
```
# Example
**Servlet:**

```java
request.setAttribute("username", "Khushi");
request.getRequestDispatcher("/welcome.jsp").forward(request, response);

**JSP (welcome.jsp):**
<html>
<body>
<h1>Welcome ${username}</h1>
</body>
</html>
```

**Output:**
```text
Welcome Khushi
```
Here:
* Servlet processes the request.
* Servlet sends data using `setAttribute()`.
* JSP displays the data using Expression Language.

# 4. JSTL (JSP Standard Tag Library)
JSTL stands for **JSP Standard Tag Library**.
It provides predefined tags that help developers perform common tasks in JSP without writing Java scriptlets.
JSTL makes JSP pages cleaner and easier to maintain.

- Why do we use JSTL?
* To avoid Java code inside JSP pages.
* To perform conditional operations.
* To iterate over collections.
* To display formatted data.
* To manage URLs and internationalization.

# Important JSTL Libraries

| Library    | Prefix | Purpose                                                          |
| ---------- | ------ | ---------------------------------------------------------------- |
| Core       | `c`    | Conditions, loops and variables                                  |
| Formatting | `fmt`  | Date, number and message formatting                              |
| Functions  | `fn`   | String operations                                                |
| SQL        | `sql`  | Database-related tags (generally avoided in modern applications) |
| XML        | `x`    | XML processing                                                   |

# JSTL Core Tags

Some commonly used core tags are:

| Tag             | Purpose                       |
| --------------- | ----------------------------- |
| `<c:out>`       | Displays output               |
| `<c:set>`       | Creates or updates a variable |
| `<c:if>`        | Performs conditional checking |
| `<c:choose>`    | Provides multiple conditions  |
| `<c:when>`      | Defines a condition           |
| `<c:otherwise>` | Defines the default condition |
| `<c:forEach>`   | Iterates over a collection    |
| `<c:remove>`    | Removes a variable            |

# 5. Expression Language (EL)

EL stands for Expression Language.
It is used in JSP to access data and display values without writing Java scriptlets.
EL makes JSP pages simple and readable.

- Syntax
```jsp
${expression}
```

- Why do we use EL?
* To access request attributes.
* To access session attributes.
* To display JavaBean properties.
* To access request parameters.
* To reduce Java code inside JSP.

- Important EL Implicit Objects

| Object             | Purpose                                    |
| ------------------ | ------------------------------------------ |
| `param`            | Accesses request parameters                |
| `paramValues`      | Accesses multiple parameter values         |
| `requestScope`     | Accesses request attributes                |
| `sessionScope`     | Accesses session attributes                |
| `applicationScope` | Accesses application attributes            |
| `pageScope`        | Accesses page attributes                   |
| `header`           | Accesses request headers                   |
| `cookie`           | Accesses cookies                           |
| `initParam`        | Accesses context initialization parameters |

# 6. JSTL vs Expression Language (EL)

Both JSTL and EL are used in JSP to reduce Java scriptlets, but they have different purposes.

| Feature    | JSTL                     | Expression Language            |
| ---------- | ------------------------ | ------------------------------ |
| Full Form  | JSP Standard Tag Library | Expression Language            |
| Purpose    | Performs operations      | Accesses and displays data     |
| Syntax     | XML-like tags            | `${...}`                       |
| Conditions | `<c:if>`                 | Used inside conditions         |
| Loops      | `<c:forEach>`            | Does not provide loop tags     |
| Variables  | `<c:set>`                | Reads variables and attributes |
| Main Usage | Logic in JSP             | Displaying data                |

- When to Use JSTL?

Use JSTL when you want to:
* Apply conditions.
* Create loops.
* Iterate through lists.
* Set or remove variables.
* Format dates and numbers.

- When to Use EL?
Use EL when you want to:
* Display data received from a Servlet.
* Access request attributes.
* Access session attributes.
* Retrieve form parameters.
* Access JavaBean properties.

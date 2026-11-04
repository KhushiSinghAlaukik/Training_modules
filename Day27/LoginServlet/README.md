# Day 27 – Java Servlets

# Topics covered 

• Servlet
• Servlet lifecycle
• Request
• Response
• doGet
• doPost
• Session

# 1. What is a Servlet?
A Servlet is a server-side Java program that handles HTTP requests from clients (browsers) and sends HTTP responses.

- Uses of Servlets:-
* Processing HTML form data.
* Handling login and registration.
* Communicating with databases.
* Managing user sessions.
* Generating dynamic web content.

- Advantages:-
* Platform independent.
* Secure and efficient.
* Supports database connectivity through JDBC.
* Can handle multiple client requests.
* Integrates with Java technologies such as JSP.

# 2. Servlet Lifecycle
The Servlet lifecycle describes the stages through which a Servlet passes from creation to destruction.
The Servlet container manages the entire lifecycle.

- Lifecycle Methods

* 1.Loading and Instantiation
The Servlet container loads the Servlet class and creates its object.

* 2.init()
Called only once during the Servlet's lifecycle.
Used for initialization tasks.
Example: Initializing resources.

* 3.service()
Called whenever a request arrives.
Processes incoming requests.
Dispatches HTTP requests to methods such as `doGet()` and `doPost()`.

* 4.destroy()
Called once before the Servlet is removed.
Used to release resources.
 
- Important Lifecycle Methods

| Method      | Description               | Execution             |
| ----------- | ------------------------- | --------------------- |
| `init()`    | Initializes the Servlet   | Once                  |
| `service()` | Processes client requests | For each request      |
| `doGet()`   | Handles GET requests      | When GET is received  |
| `doPost()`  | Handles POST requests     | When POST is received |
| `destroy()` | Releases resources        | Once before removal   |

# 3. Request

An HTTP Request is a message sent by a client (browser) to a server to request a resource or perform an operation.
In Servlets, the `HttpServletRequest` interface is used to access request information.

- Types of Request Information
* Request parameters
* Request headers
* Request method
* Request URL
* Form data

- Common Request Methods

| Method            | Purpose                   |
| ----------------- | ------------------------- |
| `getParameter()`  | Retrieves form parameters |
| `getMethod()`     | Returns HTTP method       |
| `getRequestURI()` | Returns requested URI     |
| `getHeader()`     | Retrieves request headers |
| `getSession()`    | Gets or creates a session |

# 4. Response

An HTTP Response is a message sent by the server back to the client after processing a request.
In Servlets, the `HttpServletResponse` interface is used to generate responses.

- Types of Responses:-
* HTML content
* Plain text
* JSON data
* Redirect responses
* Error messages

- Common Response Methods

| Method             | Purpose                    |
| ------------------ | -------------------------- |
| `setContentType()` | Sets response content type |
| `getWriter()`      | Sends text or HTML output  |
| `sendRedirect()`   | Redirects to another URL   |
| `setStatus()`      | Sets HTTP status code      |
| `sendError()`      | Sends an error response    |

# 5. doGet() Method

The `doGet()` method handles HTTP GET requests.
It is generally used to retrieve or display information from the server.

- Characteristics of GET
* Used to retrieve data.
* Parameters are commonly sent in the URL.
* Can be bookmarked.
* Suitable for fetching information.
* Should not be used for sensitive information.


# 6. doPost() Method

The `doPost()` method handles HTTP POST requests.
It is generally used to submit data to the server.

- Characteristics of POST:-
* Used to submit data.
* Form data is sent in the request body.
* Suitable for login and registration forms.
* Data is not normally displayed in the URL.
* Can submit larger amounts of data than GET.

* Note: POST does not automatically encrypt data. Use HTTPS to protect sensitive information.

# 7. Difference Between doGet() and doPost()

| Feature       | doGet()                         | doPost()                                          |
| ------------- | ------------------------------- | ------------------------------------------------- |
| HTTP Method   | GET                             | POST                                              |
| Purpose       | Retrieve data                   | Submit data                                       |
| Data Location | Usually URL                     | Request body                                      |
| Security      | Not suitable for sensitive data | Not secure without HTTPS                          |
| Bookmarking   | Can be bookmarked               | Cannot normally be bookmarked with submitted data |
| Common Use    | Search and display              | Login and registration                            |


## 8. Session Management

A session is a mechanism used to maintain information about a particular user across multiple requests.
HTTP is a stateless protocol. This means the server does not automatically remember previous requests from a client.
Sessions help maintain user information between requests.

- Why Do We Need Sessions?
Consider a login application:
1. User logs in.
2. Server verifies credentials.
3. User opens the dashboard.
4. User navigates to another page.

Without session management, the server would not automatically remember that the user had logged in.
 
- Common Session Methods

| Method                     | Purpose                        |
| -------------------------- | ------------------------------ |
| `getSession()`             | Creates or retrieves a session |
| `setAttribute()`           | Stores session data            |
| `getAttribute()`           | Retrieves session data         |
| `removeAttribute()`        | Removes a particular attribute |
| `invalidate()`             | Destroys the session           |
| `getId()`                  | Returns session ID             |
| `getMaxInactiveInterval()` | Returns session timeout        |

- Session Management Techniques
1. Cookies
2. HttpSession
3. URL Rewriting
4. Hidden Form Fields
 
# 9. GET vs POST vs Session

| Concept | Purpose                                   |
| ------- | ----------------------------------------- |
| GET     | Retrieve information from the server      |
| POST    | Send information to the server            |
| Session | Maintain user information across requests |


# Day 26 

# Topics Covered

* Client-Server Architecture
* HTTP
* HTTPS
* HTTP Request
* HTTP Response
* HTTP Methods
* HTTP Status Codes
* HTTP Headers
* JSON

# 1. Client-Server Architecture

Client-server architecture is a model in which a client sends a request to a server, and the server processes it and returns a response.

- Example
When you open Instagram:
1. Your browser or mobile application acts as the client.
2. It sends a request to Instagram's server.
3. The server processes the request.
4. The server sends a response.
5. The application displays the result.

- Main Components
* Client: Requests information or services.
* Server: Processes requests and sends responses.
* Network: Allows the client and server to communicate.

# 2. HTTP

HTTP stands for Hypertext Transfer Protocol.
It is a protocol used for communication between clients and servers on the web.

- Example
When we send a request to:
`http://localhost:8080/employees`
The client sends an HTTP request to the application running on our local server.
The server processes the request and returns an HTTP response.

# 3. HTTPS

HTTPS stands for Hypertext Transfer Protocol Secure.
It uses TLS encryption to protect communication between the client and server.
Difference Between HTTP and HTTPS
HTTP	HTTPS
Communication is not encrypted by HTTP itself.	Communication is encrypted using TLS.
Data can be exposed if intercepted.	Encryption helps protect data in transit.
URL begins with http://.	URL begins with https://.
Commonly used for local development.	Commonly used for secure production websites.

Example:

http://example.com
https://example.com

HTTPS helps protect sensitive information, such as login credentials, while it travels between the client and server.

# 4. HTTP Request

An HTTP request is a message sent by a client to a server to perform an operation or retrieve information.
Main Parts of an HTTP Request
Method: Specifies the operation to perform.
URL: Identifies the requested resource.
Headers: Provide additional information about the request.
Body: Contains data sent to the server, when needed.
Example
GET /employees HTTP/1.1
Host: localhost:8080

# 5. HTTP Response

An HTTP response is the message sent by the server back to the client.
Main Parts of an HTTP Response
Status code: Indicates the result of the request.
Headers: Provide information about the response.
Body: Contains the returned data, if any.
- Example
HTTP/1.1 200 OK
Content-Type: application/json
Response body:
[
  "Aman",
  "Priya"
]

# 6. HTTP Methods

HTTP methods describe what the client wants the server to do.

- GET — Retrieve employees
- POST — Add an employee
- PUT — Replace an employee's name
- PATCH — Update an employee's name
- DELETE — Remove an employee

# 7. HTTP Status Codes

HTTP status codes tell the client what happened when the server processed a request.
- 2xx — Success

* 200 OK	Request completed successfully
* 201 Created	A resource was created successfully
* 204 No Content	Request succeeded, but there is no response body
* 301 Moved Permanently	Resource has moved permanently
* 302 Found	Temporary redirection
* 400 Bad Request	Request contains invalid data
* 401 Unauthorized	Authentication is required or invalid
* 403 Forbidden	Access is not permitted
* 404 Not Found	Requested resource was not found
* 405 Method Not Allowed	HTTP method is not supported for that resource
* 500 Internal Server Error	Unexpected server-side error
* 502 Bad Gateway	Gateway received an invalid response
* 503 Service Unavailable	Server is temporarily unavailable

# 8. HTTP Headers

HTTP headers provide additional information about a request or response.


# 9. JSON

JSON stands for JavaScript Object Notation.
It is a lightweight text format used to exchange structured data between applications.
JSON is language-independent and is widely used in REST APIs.

# Task
Used Postman to understand:
GET
POST
PUT
PATCH
DELETE

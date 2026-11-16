# Day 38 — REST API Design

# 1. Introduction

REST stands for Representational State Transfer.
REST is an architectural style used to design network-based applications and APIs.
REST APIs allow different applications to communicate with each other using HTTP methods.
Examples of HTTP methods:
- GET
- POST
- PUT
- PATCH
- DELETE
A well-designed REST API should be simple, consistent, scalable, and easy to understand.

# 2. REST Best Practices

REST API best practices help developers create APIs that are easy to maintain and use.
Important practices include:
1. Use meaningful resource names.
2. Use HTTP methods correctly.
3. Use appropriate HTTP status codes.
4. Use JSON for request and response data when appropriate.
5. Implement pagination for large datasets.
6. Support filtering and sorting.
7. Handle errors consistently.
8. Use API versioning.
9. Validate incoming request data.
10. Avoid exposing unnecessary internal implementation details.

# 3. Resource Naming

In REST APIs, resources represent objects or entities in an application.
Examples:
- Employees
- Departments
- Products
- Students
- Orders
Resource names should generally be nouns rather than verbs.

# Best Practices
1. Use plural nouns
2. Use HTTP methods to represent actions
3. Use IDs to identify individual resources
4. Represent relationships using nested resources where appropriate

# 4. HTTP Status Codes

HTTP status codes indicate the result of an API request.
They are divided into five categories.

# 1xx — Informational

Indicates that the request has been received and processing is continuing.

# 2xx — Success

Indicates that the request was successfully processed.

| Status Code | Meaning |
|---|---|
| 200 OK | Request successful. |
| 201 Created | Resource successfully created. |
| 202 Accepted | Request accepted for processing. |
| 204 No Content | Request successful, but no response body is returned. |

# 3xx — Redirection

Indicates that further action is needed to complete the request.

| Status Code | Meaning |
|---|---|
| 301 Moved Permanently | Resource has permanently moved. |
| 302 Found | Resource is temporarily located elsewhere. |
| 304 Not Modified | Cached resource has not changed. |

# 4xx — Client Errors

Indicates an issue with the request sent by the client.

| Status Code | Meaning |
|---|---|
| 400 Bad Request | Invalid request. |
| 401 Unauthorized | Authentication is required or invalid. |
| 403 Forbidden | Client does not have permission. |
| 404 Not Found | Requested resource does not exist. |
| 405 Method Not Allowed | HTTP method is not supported for the resource. |
| 409 Conflict | Request conflicts with the current resource state. |
| 422 Unprocessable Content | Request content cannot be processed. |

# 5xx — Server Errors

Indicates that the server failed to process a valid request.

| Status Code | Meaning |
|---|---|
| 500 Internal Server Error | Unexpected server error. |
| 501 Not Implemented | Server does not support the requested functionality. |
| 502 Bad Gateway | Invalid response from an upstream server. |
| 503 Service Unavailable | Server is temporarily unavailable. |
| 504 Gateway Timeout | Upstream server did not respond in time. |

5. Pagination

Pagination means dividing a large collection of records into smaller pages.
It prevents APIs from returning thousands of records in a single response.

 Advantages:
- Improves performance.
- Reduces network traffic.
- Makes large datasets easier to manage.
- Improves user experience.

In Spring Data JPA, pagination is supported through:
- `Pageable`
- `Page`
- `PageRequest`

# 6. Sorting

Sorting means arranging records according to a particular field.
For example, employees can be sorted by:
- Name
- Salary
- ID
- Department

 Advantages:
- Organizes records.
- Makes comparison easier.
- Helps users find information quickly.

## 7. Filtering

Filtering means retrieving records based on specific conditions.
For example, an employee API may contain employees from different departments.
We can retrieve only IT employees.

# 8. Search

Search allows users to find specific records using keywords or search terms.
For example, users may want to find an employee by name.
This API can return employees whose names match the search term.
Search can be implemented using:
- SQL LIKE queries.
- Spring Data JPA derived query methods.
- Custom JPQL queries.
- Full-text search engines for more advanced requirements.

# 9. API Versioning

API versioning allows developers to introduce changes to an API without breaking applications that use older versions.
For example, an application may initially provide API version 1.
Later, developers may introduce new features and create version 2.

# URL-Based Versioning
### Other Versioning Approaches
1. Query Parameter Versioning
2. Header-Based Versioning
3. Media Type Versioning
The client specifies the API version through the Accept header.

# Advantages
- Maintains backward compatibility.
- Allows gradual API improvements.
- Prevents breaking existing clients.
- Makes API maintenance easier.

 10. Difference Between Pagination, Sorting, Filtering and Search

| Feature | Meaning | Example |
|---|---|---|
| Pagination | Divides records into pages. | `?page=0&size=10` |
| Sorting | Arranges records in order. | `?sort=salary,desc` |
| Filtering | Retrieves records matching a condition. | `?department=IT` |
| Search | Finds records using keywords. | `?search=Rahul` |


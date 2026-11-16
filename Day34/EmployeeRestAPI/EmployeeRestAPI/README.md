# Day 34 — Spring Boot REST API

# 1. REST Architecture

REST stands for Representational State Transfer.
It is an architectural style used to design network-based applications. REST APIs allow clients and servers to communicate using HTTP.

Example:
A client sends a request to retrieve employee details, and the server returns employee information in JSON format.

# 2. REST Principles

The main principles of REST architecture are:

- **Client-Server:** Client and server operate independently.
- **Stateless:** Every request contains the information needed to process it.
- **Cacheable:** Responses can be cached when appropriate.
- **Uniform Interface:** APIs follow a consistent way of interacting with resources.
- **Layered System:** Communication can happen through multiple layers.
- **Code on Demand:** Servers can optionally provide executable code to clients.

# 3. @RestController

`@RestController` is used to create REST controllers in Spring Boot.
It combines:
- `@Controller`
- `@ResponseBody`

It allows methods to return data directly as JSON or other response formats.

Example:
@RestController
public class EmployeeController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Employee API";
    }
}

# 4. @GetMapping

`@GetMapping` handles HTTP GET requests.
It is generally used to retrieve information from the server.

Example:

@GetMapping("/employees")
public String getEmployees() {
    return "List of Employees";
}

# 5. @PostMapping

`@PostMapping` handles HTTP POST requests.
It is generally used to create new resources.

Example:

@PostMapping("/employees")
public String addEmployee() {
    return "Employee Added Successfully";


# 6. @PutMapping

`@PutMapping` handles HTTP PUT requests
It is generally used to update an existing resource.

Example:

@PutMapping("/employees/{id}")
public String updateEmployee(@PathVariable int id) {
    return "Employee Updated: " + id;
}

# 7. @DeleteMapping

`@DeleteMapping` handles HTTP DELETE requests
It is generally used to delete an existing resource.

Example:

@DeleteMapping("/employees/{id}")
public String deleteEmployee(@PathVariable int id) {
    return "Employee Deleted: " + id;
}

# 8. Path Variables

`@PathVariable` is used to extract values directly from the URL.

Example:

@GetMapping("/employees/{id}")
public String getEmployee(@PathVariable int id) {
    return "Employee ID: " + id;
}

Request:
GET http://localhost:8080/employees/101

Output:
Employee ID: 101

# 9. Request Parameters

`@RequestParam` is used to extract query parameters from the URL.

Example:

@GetMapping("/search")
public String searchEmployee(@RequestParam String name) {
    return "Searching Employee: " + name;
}

Request:
GET http://localhost:8080/search?name=Rahul

Output:
Searching Employee: Rahul
# 10. Request Body

`@RequestBody` is used to convert incoming JSON request data into a Java object.
Example:

@PostMapping("/employees")
public Employee addEmployee(@RequestBody Employee employee) {
    return employee;
}

JSON Request:
{
    "id": 1,
    "name": "Rahul",
    "department": "IT",
    "salary": 45000
}

# Task Done:
Employee REST API
GET /employees
GET /employees/{id}
POST /employees
PUT /employees/{id}
DELETE /employees/{id}
# Day 39 — Spring Security

# 1. Introduction

Spring Security is a framework used to secure Java and Spring Boot applications.
It provides authentication, authorization, password protection, and protection against common security attacks.
Spring Security helps developers control who can access an application and what actions they are allowed to perform.

Main Features:
- Authentication
- Authorization
- Password hashing
- Role-based access control
- Permission management
- JWT authentication
- Security filters

# 2. Authentication

Authentication is the process of verifying the identity of a user.
The application checks whether the credentials are correct.

Authentication Process:
1. User enters username and password.
2. Application receives the login request.
3. Credentials are verified.
4. If credentials are correct, authentication succeeds.
5. The application creates an authenticated session or issues a token, depending on its security design.

If the credentials are correct, the user is authenticated.

## 3. Authorization

Authorization determines what an authenticated user is allowed to access.

For example:
- ADMIN can access the admin dashboard.
- EMPLOYEE can access employee-related APIs.
- EMPLOYEE cannot access restricted admin APIs.

# Authentication vs Authorization

| Authentication | Authorization |
|---|---|
| Verifies user identity. | Checks user permissions. |
| Answers who you are. | Answers what you can access. |
| Happens before authorization. | Applies access rules to an authenticated identity. |
| Example: Login. | Example: Admin dashboard access. |

# 4. Password Hashing

Password hashing converts a password into a one-way hash value.
Applications should never store passwords as plain text.
Spring Security provides password encoders to securely hash passwords.

# BCryptPasswordEncoder

BCrypt is a password-hashing algorithm supported by Spring Security.

Advantages:
- Passwords are not stored in plain text.
- BCrypt uses a salt.
- Password verification does not require decrypting the hash.
- It makes offline password guessing more expensive.

# 5. Roles

Roles represent categories of users with different access levels.

Examples:
- ADMIN
- EMPLOYEE
- MANAGER
- CUSTOMER

# 6. Permissions

Permissions define the specific actions a user is allowed to perform.

Examples:
- READ
- WRITE
- UPDATE
- DELETE

# 7. JWT (JSON Web Token)

JWT stands for JSON Web Token.
It is a compact, digitally signed token used to transfer information between parties.
JWT is commonly used for stateless authentication in REST APIs.

# JWT Structure

A JWT contains three parts:
1. Header
2. Payload
3. Signature

# JWT Authentication Flow

1. User logs in.
2. Server verifies credentials.
3. Server generates a JWT.
4. Client stores the token securely.
5. Client sends the token with future requests.
6. Server validates the token.
7. Access is granted or denied according to authorization rules.

 Advantages of JWT:
- Supports stateless authentication.
- Works well with REST APIs.
- Avoids maintaining a server-side login session for each request.
- Can carry useful identity and authorization claims.

 Limitations
- Tokens must be protected from theft.
- Expiration and revocation need careful handling.
- A stolen token may be usable until it expires or is otherwise invalidated.

# 8. Spring Security Architecture

Spring Security uses a filter-based architecture.
Incoming HTTP requests pass through a chain of security filters before reaching the controller.
# Important Components:

**1. SecurityFilterChain**

Defines the security filters and authorization rules applied to HTTP requests.

**2. AuthenticationManager**

Coordinates authentication.

**3. AuthenticationProvider**

Performs a particular authentication process.

**4. UserDetailsService**

Loads user information, such as username, password hash, and authorities.

**5. PasswordEncoder**

Encodes passwords and verifies submitted passwords.

**6. SecurityContextHolder**

Stores the current authenticated user's security information for the request.

**7. OncePerRequestFilter**

Provides a base class for filters that should run once per request within a request dispatch.

It is commonly used to implement JWT authentication.

### Simplified Architecture

```text
Client Request
      |
      v
Security Filter Chain
      |
      v
JWT Authentication Filter
      |
      v
Authentication Manager
      |
      v
Authentication Provider
      |
      v
UserDetailsService
      |
      v
SecurityContextHolder
      |
      v
Authorization Check
      |
      v
Controller
      |
      v
Response
```

## 9. Role-Based Access Control

Role-Based Access Control (RBAC) restricts access based on a user's assigned role.

# Day - 13

# Topics learned
Packages & Java APIs
• Packages
• Imports
• Java API
• Access control
• Naming conventions
• Project organization

# Packages :-

A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

-Built-in Packages (packages from the Java API)
 The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.
 The library contains components for managing input, database programming, and much much more.
 The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.

-User-defined Packages (create your own packages)
 To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:
 Example
 └── root
   └── mypack
     └── MyPackageClass.java
 To create a package, use the "package" keyword.

 # imports :-

An import statement allows us to refer to classes and interfaces from another package without writing their fully qualified names every time.
example - import java.util.Scanner;

Types of imports:-

A.Single-type import
Imports a particular class or interface.
ex - import java.util.Scanner;

B. Wildcard import
Imports the accessible types declared directly in a package.
ex - import java.util.*;

C. Fully qualified class name
You can use a class's complete package and class name without importing it.
ex -  java.util.ArrayList<String> names = new java.util.ArrayList<>();


# Java API :-

Java API stands for Java Application Programming Interface.
It is a collection of predefined classes, interfaces, methods, and other types that developers can use to build applications.
Instead of writing everything from scratch, we can use functionality already provided by Java.

For example :

String-for working with text.
Scanner-for reading input.
ArrayList-for storing resizable lists.
HashMap-for storing key-value pairs.
LocalDate-for working with dates.
Math-for mathematical operations

# Access Control :-

Access control determines where a class, variable, constructor, or method can be accessed from.
Java provides four access levels:
-private
-Default (package-private)
-protected
-public

# Naming Conventions :-

Naming conventions are standard practices used to make Java code readable and consistent.
Java does not enforce every naming convention, but following them makes projects easier to understand and maintain.
A. Class names: PascalCase(Start each word with a capital letter)
B. Method names: camelCase(Start with a lowercase letter and capitalize subsequent words)
C. Variable names: camelCase
D. Constants: UPPER_SNAKE_CASE(Use uppercase letters separated by underscores for named constants).
E. Package names: lowercase(Package names are conventionally lowercase).
F. Interface names(Use PascalCase, just like class names)

# Project Organization in Java

Project organization means arranging source files, packages, resources, and configuration files in a structured way.
A good structure helps developers find code, maintain applications, and collaborate with other developers.
Let's understand this through a Student Management System.

A. Basic project structure
StudentManagement/
│
├── src/
│   ├── model/
│   │   └── Student.java
│   │
│   ├── service/
│   │   └── StudentService.java
│   │
│   ├── util/
│   │   └── InputValidator.java
│   │
│   └── Main.java
│
└── README.md

# TASK
Create proper package structure:
com.company.employee
com.company.employee.model
com.company.employee.service
com.company.employee.util

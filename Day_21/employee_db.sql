CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE departments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    location VARCHAR(50)
);

CREATE TABLE roles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    role_name VARCHAR(50)
);

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    salary INT,
    department_id INT,
    role_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(id),
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

INSERT INTO departments (name, location)
VALUES
('IT', 'Indore'),
('HR', 'Bhopal'),
('Finance', 'Mumbai');

INSERT INTO roles (role_name)
VALUES
('Developer'),
('Manager'),
('Accountant');

INSERT INTO employees (name, salary, department_id, role_id)
VALUES
('Aman', 30000, 1, 1),
('Priya', 40000, 2, 2),
('Rahul', 35000, 3, 3);

SELECT * FROM employees;
SELECT * FROM departments;
SELECT * FROM roles;
SELECT name, salary FROM employees;

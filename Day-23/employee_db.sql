CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE departments (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    location VARCHAR(50)
);

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    salary INT,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(id)
);

INSERT INTO departments (name, location)
VALUES
('IT', 'Indore'),
('HR', 'Bhopal'),
('Finance', 'Mumbai');

INSERT INTO employees (name, salary, department_id)
VALUES
('Aman', 30000, 1),
('Priya', 40000, 2),
('Rahul', 50000, 1),
('Rohit', 45000, 2);

SELECT employees.name, departments.name AS department
FROM employees
JOIN departments
ON employees.department_id = departments.id;

SELECT name, salary
FROM employees;

SELECT name, salary
FROM employees
ORDER BY salary DESC;

SELECT departments.name AS department,
       AVG(employees.salary) AS average_salary
FROM employees
JOIN departments
ON employees.department_id = departments.id
GROUP BY departments.name;

SELECT name, salary
FROM employees
ORDER BY salary DESC
LIMIT 1;
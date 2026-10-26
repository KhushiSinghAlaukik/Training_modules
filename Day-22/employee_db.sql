CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    salary INT,
    department VARCHAR(50)
);

INSERT INTO employees (name, salary, department)
VALUES ('Aman', 30000, 'IT');

INSERT INTO employees (name, salary, department)
VALUES ('Priya', 40000, 'HR');

INSERT INTO employees (name, salary, department)
VALUES ('Rahul', 35000, 'Finance');

SELECT * FROM employees
WHERE salary > 30000;

UPDATE employees
SET salary = 35000
WHERE id = 1;

SELECT * FROM employees;

DELETE FROM employees
WHERE id = 3;

SELECT * FROM employees;
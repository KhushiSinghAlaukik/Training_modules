package com.example.GlobalExceptionHandling.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.GlobalExceptionHandling.exception.EmployeeNotFoundException;
import com.example.GlobalExceptionHandling.model.Employee;

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();

    private Long nextId = 1L;

    // Add Employee
    public Employee addEmployee(Employee employee) {

        employee.setId(nextId++);

        employees.add(employee);

        return employee;
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {

        return employees;
    }

    // Get Employee By ID
    public Employee getEmployeeById(Long id) {

        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee not found with ID: " + id
                        )
                );
    }

    // Delete Employee
    public void deleteEmployee(Long id) {

        Employee employee = getEmployeeById(id);

        employees.remove(employee);
    }
}
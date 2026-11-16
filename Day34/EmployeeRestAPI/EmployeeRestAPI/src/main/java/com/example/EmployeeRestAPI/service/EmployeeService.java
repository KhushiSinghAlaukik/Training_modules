package com.example.EmployeeRestAPI.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.EmployeeRestAPI.model.*;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();
    private int nextId = 1;
    
    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {

        return employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Add employee
    public Employee addEmployee(Employee employee) {

        employee.setId(nextId++);
        employees.add(employee);
        return employee;
    }

    // Update employee
    public Employee updateEmployee(int id, Employee updatedEmployee) {

        Employee existingEmployee = getEmployeeById(id);

        if (existingEmployee != null) {

            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setDepartment(updatedEmployee.getDepartment());
            existingEmployee.setSalary(updatedEmployee.getSalary());

            return existingEmployee;
        }

        return null;
    }

    // Delete employee
    public boolean deleteEmployee(int id) {

        Employee employee = getEmployeeById(id);

        if (employee != null) {
            employees.remove(employee);
            return true;
        }

        return false;
    }
}
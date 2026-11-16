package com.example.DepartmentEmployeesApi.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.DepartmentEmployeesApi.entity.Employee;
import com.example.DepartmentEmployeesApi.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    // Add Employee To Department
    @PostMapping("/department/{departmentId}")
    public ResponseEntity<Employee> addEmployee(
            @PathVariable Long departmentId,
            @RequestBody Employee employee) {

        return new ResponseEntity<>(
            employeeService.addEmployee(departmentId, employee),
            HttpStatus.CREATED
        );
    }

    // Get All Employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {

        return ResponseEntity.ok(
            employeeService.getAllEmployees()
        );
    }

    // Get Employee By ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
            employeeService.getEmployeeById(id)
        );
    }

    // Get Employees By Department
    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(
            @PathVariable Long departmentId) {

        return ResponseEntity.ok(
            employeeService.getEmployeesByDepartment(departmentId)
        );
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
            @PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }
}
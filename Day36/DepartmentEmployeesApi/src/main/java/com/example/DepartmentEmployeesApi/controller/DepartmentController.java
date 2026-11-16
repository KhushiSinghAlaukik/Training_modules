package com.example.DepartmentEmployeesApi.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.DepartmentEmployeesApi.entity.Department;
import com.example.DepartmentEmployeesApi.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {

        this.departmentService = departmentService;
    }

    // Add Department
    @PostMapping
    public ResponseEntity<Department> addDepartment(
            @RequestBody Department department) {

        return new ResponseEntity<>(
            departmentService.addDepartment(department),
            HttpStatus.CREATED
        );
    }

    // Get All Departments
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {

        return ResponseEntity.ok(
            departmentService.getAllDepartments()
        );
    }

    // Get Department With Employees
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
            departmentService.getDepartmentById(id)
        );
    }

    // Delete Department
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(
            @PathVariable Long id) {

        departmentService.deleteDepartment(id);

        return ResponseEntity.noContent().build();
    }
}
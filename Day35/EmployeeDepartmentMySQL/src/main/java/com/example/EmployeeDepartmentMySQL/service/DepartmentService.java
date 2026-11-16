package com.example.EmployeeDepartmentMySQL.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeeDepartmentMySQL.entity.Department;
import com.example.EmployeeDepartmentMySQL.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // Add Department
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Get All Departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Get Department By ID
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    // Delete Department
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
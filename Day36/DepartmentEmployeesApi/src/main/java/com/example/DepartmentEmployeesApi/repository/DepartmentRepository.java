package com.example.DepartmentEmployeesApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DepartmentEmployeesApi.entity.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {

}
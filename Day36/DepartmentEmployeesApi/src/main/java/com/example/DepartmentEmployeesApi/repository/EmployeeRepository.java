package com.example.DepartmentEmployeesApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DepartmentEmployeesApi.entity.Employee;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentId(Long departmentId);

}
package com.example.EmployeeDepartmentMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EmployeeDepartmentMySQL.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}